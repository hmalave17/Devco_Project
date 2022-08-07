package userInterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.name("password"));
    public static final Target BUTTON_LOGIN = Target.the("Input login").located(By.className("Ut3prtt_wDsi7NM_83Jc"));
    public static final Target MESSAGE_PASSWORD_INCORRECT = Target.the("Message password incorrect").located(By.className("fD2Lif3G4ehCgKZJDFwf"));

}
