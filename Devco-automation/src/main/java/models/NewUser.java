package models;

public class NewUser {

    private String email;
    private String invalidEmail;
    private String password;
    private String wrongPassord;

    NewUser(){
        email = "Hernanmalave%s@gmail.com";
        invalidEmail = "hernan";
        password = "testOne1234";
        wrongPassord = "testOne1235";
    }

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
}
