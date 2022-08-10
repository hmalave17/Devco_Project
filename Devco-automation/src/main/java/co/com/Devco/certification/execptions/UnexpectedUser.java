package co.com.Devco.certification.execptions;

public class UnexpectedUser extends AssertionError{
    public static final String NAME_USER= "The name user is unexpected";
    public UnexpectedUser(String message, Throwable cause){
        super(message, cause);
    }

}
