package music.Service.Login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import music.Convertor.LoginConvert;
import music.DTO.LoginDTO;
import music.Entity.LoginEntity;
import music.Repository.LoginRepository;

@Service
public class LoginService implements iLogin {
	@Autowired
	private LoginRepository loginRep;
	@Autowired
	private LoginConvert convert;

	@SuppressWarnings("unused")
	@Override
	public LoginDTO checkLogin(LoginDTO dto) {
		LoginDTO logindto = new LoginDTO();

		List<LoginEntity> listPass = new ArrayList<LoginEntity>();
		listPass = loginRep.findAll();
		int size = listPass.size();

		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

		int checkLoginCount = 0;
		
		LoginEntity checkUser = loginRep.findOneByUser(dto.getUser());
		
		for (int i = 0; i < size; i++) {
			String passCheckinList = listPass.get(i).getPassword();
			String userCheck = listPass.get(i).getUser();

			boolean passwordIsValid = bCryptPasswordEncoder.matches(dto.getPassword(), passCheckinList);
			if (passwordIsValid && checkUser != null && userCheck == checkUser.getUser()) {
				checkLoginCount += 1;
			}
		}
		System.out.println("check count " + checkLoginCount);
		

		if (checkUser == null) {
			logindto.setErr(1);
			logindto.setMess("Không có tài khoản này");
		}

		if (checkUser != null && checkLoginCount == 0) {
			logindto.setErr(3);
			logindto.setMess("mật khẩu sai");

		} else if (checkUser != null && checkLoginCount > 0) {
			logindto = convert.toJSON(checkUser);

			logindto.setErr(0);
			logindto.setMess("Đăng nhập thành công");

		}

		return logindto;
	}

}
