package models;

public class NewUser {

    private String name;
    private String displayNAme;
    private String email;
    private String worngEmail;
    private String password;
    private String wrongPassord;
    private String phoneNumber;
    private String day;
    private String year;
    private String country;
    private String address;
    private String town;
    private String zipCode;


    NewUser(){
        name = "Hernan Malave";
        displayNAme = "Hernan";
        email = "Hernanmalave%s@gmail.com";
        worngEmail = "testOneDevco@test.com";
        password = "testOne1234";
        wrongPassord = "testOne1235";
        phoneNumber = "3105001020";
        day = "30";
        year = "1986";
        country = "Colombia";
        address = "Medellin";
        town = "Medellin";
        zipCode = "50001";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayNAme() {
        return displayNAme;
    }

    public void setDisplayNAme(String displayNAme) {
        this.displayNAme = displayNAme;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
