package music.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import music.DTO.LoginDTO;
import music.Entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
	public LoginDTO findOneById(Long id);

	public LoginEntity findOneByUser(String user);

	public LoginEntity findOneByPassword(String password);
}
