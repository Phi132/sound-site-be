package music.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import music.DTO.LoginDTO;
import music.Service.Login.iLogin;

@CrossOrigin(origins = "*")
@RestController
public class Login {
	
	@Autowired
	private iLogin loginSer;

	@GetMapping("/")
	public String get() {
		return "Thành Công";
	}
	@PostMapping("/login")
	public LoginDTO check(@RequestBody LoginDTO dto) {
		return loginSer.checkLogin(dto);
	}
}
