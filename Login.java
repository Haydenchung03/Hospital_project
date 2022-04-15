public class Login {

    public String username;
    public String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String print() {

        return "Username is: " + this.username + "\nPassword is: " + this.password;
    }
}
