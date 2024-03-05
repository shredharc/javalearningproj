package Classes;

public class User {
    private String username;
    private String password;
    private String compName;
 
    User(String usr, String pwd){ //parameterized constroctor
        username = usr;
        validatePassword(pwd);
    }
    public User() {
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = "Mr." + username;
    }

    public void setPassword(String pwd) {
        validatePassword(pwd);
    }
   
    public void printuserdata(){
        System.out.println(username +"\n"+ password );
    }

    private void validatePassword(String pwd) {
        //validation
        if (pwd.length()>8) {
            password = pwd;
        } else {
            System.out.println("invalid pwd");
        }
    }
    
}