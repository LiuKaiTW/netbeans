
package Model;

public class registerfile {
    private String Username;
    private String Password;
    String registerusername[]=new String[20];
String registerpassword[]=new String[20];
public registerfile(){}

    public registerfile(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
