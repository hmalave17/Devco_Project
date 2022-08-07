package enums;

public enum Message {

    WRONG_PASSWORD("Las contraseñas no coinciden. Inténtalo de nuevo.."),
    INVALID_EMAIL("Comprueba si el e-mail que has introducido es correcto."),
    INVALID_PASSWORD("La contraseña debe tener al menos 10 caracteres."),

    ;

    private String informative;
    Message(String informative){
        this.informative = informative;
    }

    public String getInformative() {
        return informative;
    }
}
