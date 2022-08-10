package co.com.Devco.certification.execptions;

public class UnexpectedMessage extends AssertionError{
    public static final String UNEXPECTED_MESSAGE = "unexpected message";

    public UnexpectedMessage(String message, Throwable cause){
        super(message, cause);
    }

}
