package co.com.Devco.certification.execptions;

public class UnexpectedLabel extends AssertionError{
    public static final String LABEL_TEXT_UNEXPECTED = "la etiqueta no muestra el texto esperado";
    public UnexpectedLabel(String message, Throwable cause){
        super(message, cause);
    }
}
