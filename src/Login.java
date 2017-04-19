import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Login {

	private String username;
	private String password;
	private boolean hata = true;
	public static short id;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String checkValidity() {

		if (getUsername().equalsIgnoreCase("admin") && getPassword().equalsIgnoreCase("1234")) {
			id = 1;
			return "true";
		} else {
			id = 0;
			setHata(false);
			return "false";

		}
	}

	public boolean isHata() {
		return hata;
	}

	public void setHata(boolean hata) {
		this.hata = hata;
	}

}
