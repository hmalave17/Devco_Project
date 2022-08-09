package models;

public class NewUser {

    private String name;
    private String email;
    private String invalidEmail;
    private String password;
    private String wrongPassord;
    private String createEmail;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWrongPassord() {
        return wrongPassord;
    }

    public void setWrongPassord(String wrongPassord) {
        this.wrongPassord = wrongPassord;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateEmail() {
        return createEmail;
    }

    public void setCreateEmail(String createEmail) {
        this.createEmail = createEmail;
    }
}
