package main.java.model;

/**
 * Created by m.slefarski on 2017-05-26.
 */
public class User {



	private String login;
    private String email;
    private String time_registered;
    
    public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTime_registered() {
		return time_registered;
	}

	public void setTime_registered(String time_registered) {
		this.time_registered = time_registered;
	}
	

    public User(String login, String email, String time_registered){
        this.login=login;
        this.email=email;
        this.time_registered =time_registered;
    }

}
