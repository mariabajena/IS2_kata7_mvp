package mvp;

public class Model {
    private String password;
    
    public Model() {
    this.password = "qwerty123"; //default password
    }
    public String getPassword() {
    return password;
    }
    public void setPassword(String password) {
    this.password = password;
    }

}
