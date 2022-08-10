package co.com.Devco.certification.execptions;

public class UnexpectedPrice extends AssertionError{
    public static final String PRICE = "The filter doest not show the price expected";
    public UnexpectedPrice(String message, Throwable cause){
        super(message, cause);
    }
}
