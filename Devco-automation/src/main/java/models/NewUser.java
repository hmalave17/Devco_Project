package models;

public class NewUser {

    private String name;
    private String email;
    private String worngEmail;
    private String invalidEmail;
    private String password;
    private String wrongPassord;
    private String invalidPassword;



    NewUser(){
        name = "Hernan Malave";
        email = "Hernanmalave%s@gmail.com";
        worngEmail = "testOneDevco@test.com";
        invalidEmail = "hernan";
        password = "testOne1234";
        wrongPassord = "testOne1235";
        invalidPassword = "1234";

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorngEmail() {
        return worngEmail;
    }

    public void setWorngEmail(String worngEmail) {
        this.worngEmail = worngEmail;
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

    public String getInvalidPassword() {
        return invalidPassword;
    }

    public void setInvalidPassword(String invalidPassword) {
        this.invalidPassword = invalidPassword;
    }
}
