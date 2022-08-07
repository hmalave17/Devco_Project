package models;

public class RegisteredUser {

    private String name;
    private String email;
    private String password;

    public RegisteredUser(){
        name = "Hernan Malave";
        email = "TestOneDevco@test.com";
        password = "testOne1234";
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
