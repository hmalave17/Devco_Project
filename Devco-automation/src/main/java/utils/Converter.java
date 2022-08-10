package utils;


import models.DataExcel;
import models.Transaccion;
import models.NewUser;

public class Converter {

    private Converter(){}

    public static Transaccion data(DataExcel dataExcel){
        Transaccion hooking = new Transaccion();
        hooking.setAddessDestiny(dataExcel.getSetDeDatos().get(0).get("Destiny"));
        hooking.setName(dataExcel.getSetDeDatos().get(0).get("Name"));
        hooking.setLastName(dataExcel.getSetDeDatos().get(0).get("Lastname"));
        hooking.setEmail(dataExcel.getSetDeDatos().get(0).get("Email"));
        hooking.setInvalidEmail(dataExcel.getSetDeDatos().get(0).get("InvalidEmail"));
        hooking.setEmailWrong(dataExcel.getSetDeDatos().get(0).get("testOne1234"));
        hooking.setPlaceDelivery(dataExcel.getSetDeDatos().get(0).get("placeDelivery"));
        return hooking;
    }

    public static NewUser registre(DataExcel dataExcel){
        NewUser newUser = new NewUser();
        newUser.setName(dataExcel.getSetDeDatos().get(0).get("Name"));
        newUser.setEmail(dataExcel.getSetDeDatos().get(0).get("Email"));
        newUser.setInvalidEmail(dataExcel.getSetDeDatos().get(0).get("InvalidEmail"));
        newUser.setPassword(dataExcel.getSetDeDatos().get(0).get("Password"));
        newUser.setWrongPassord(dataExcel.getSetDeDatos().get(0).get("PasswordWrong"));
        newUser.setCreateEmail(dataExcel.getSetDeDatos().get(0).get("EmailCreate"));
        return newUser;
    }

}
