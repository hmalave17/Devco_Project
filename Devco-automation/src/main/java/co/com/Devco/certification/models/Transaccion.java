package co.com.Devco.certification.models;

public class Transaccion {

    private String addessDestiny;
    private String name;
    private String lastName;
    private String email;
    private String emailWrong;
    private String invalidEmail;
    private String placeDelivery;


    public String getAddessDestiny() {
        return addessDestiny;
    }

    public void setAddessDestiny(String addessDestiny) {
        this.addessDestiny = addessDestiny;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailWrong() {
        return emailWrong;
    }

    public void setEmailWrong(String emailWrong) {
        this.emailWrong = emailWrong;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getPlaceDelivery() {
        return placeDelivery;
    }

    public void setPlaceDelivery(String placeDelivery) {
        this.placeDelivery = placeDelivery;
    }
}
