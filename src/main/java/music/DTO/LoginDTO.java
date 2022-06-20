package music.DTO;

import music.Entity.LoginEntity;

public class LoginDTO extends Abstract<LoginEntity> {
	private String user;
	private String password;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private int err;
	private String mess;

	public int getErr() {
		return err;
	}

	public void setErr(int err) {
		this.err = err;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPasword(String password) {
		this.password = password;
	}

}
