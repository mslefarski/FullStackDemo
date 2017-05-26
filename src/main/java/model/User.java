package main.java.model;

/**
 * Created by m.slefarski on 2017-05-26.
 */
public class User {

    private String login;
    private String email;
    private String time_registered;

    public User(String login, String email, String time_registered){
        this.login=login;
        this.email=email;
        this.time_registered =time_registered;
    }

}
