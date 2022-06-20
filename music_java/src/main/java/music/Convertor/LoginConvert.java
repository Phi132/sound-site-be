package music.Convertor;

import org.springframework.stereotype.Component;

import music.DTO.LoginDTO;
import music.Entity.LoginEntity;

@Component
public class LoginConvert {

	public LoginDTO toJSON(LoginEntity entity) {
		LoginDTO dto = new LoginDTO();
		dto.setUser(entity.getUser());
		dto.setPasword(entity.getPassword());
		dto.setName(entity.getName());
		return dto;
	}

	public LoginEntity toEntity(LoginDTO dto) {
		LoginEntity en = new LoginEntity();
		en.setUser(dto.getUser());
		en.setPassword(dto.getPassword());
		en.setCreatedBy(dto.getCreatedBy());
		en.setCreatedDate(dto.getCreatedDate());
		en.setModifielBy(dto.getModifielBy());
		en.setModifielDate(dto.getModifielDate());
		return en;
	}
}
