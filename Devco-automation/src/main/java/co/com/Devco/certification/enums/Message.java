package co.com.Devco.certification.enums;

public enum Message {

    WRONG_PASSWORD("Las contraseñas no coinciden. Inténtalo de nuevo."),
    INVALID_EMAIL("Comprueba si el e-mail que has introducido es correcto"),
    INVALID_PASSWORD("La contraseña debe tener al menos 10 caracteres"),
    WRONG_PASSWORD_USER("La combinación de e-mail y contraseña que has introducido no coinciden"),
    ROOM_MANDATORY("Error:\nSelecciona el número de opciones que quieras reservar"),
    DATA_MANDATORY("¡Vaya! Te has olvidado un detalle. Por favor, rellena los campos que faltan y continúa:"),
    EMAIL_INVALID("Introduce una dirección de e-mail válida"),
    EMAIL_DOEST_NOT_MATCHES("Los campos \"E-mail\" y \"Confirmar dirección de e-mail\" deben coincidir")


    ;

    private String informative;
    Message(String informative){
        this.informative = informative;
    }

    public String getInformative() {
        return informative;
    }
}
