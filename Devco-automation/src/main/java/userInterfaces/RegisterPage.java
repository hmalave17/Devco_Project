package userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject {

    public static final Target INPUT_EMAIL = Target.the("Input email").located(By.name("username"));
    public static final Target BUTTON_CONTINUE_EMAIL = Target.the("Button continue email").located(By.className("Ut3prtt_wDsi7NM_83Jc"));
    public static final Target INPUT_NEW_PASSWORD = Target.the("Input new password").located(By.name("new_password"));
    public static final Target INPUT_CONFIRMED_PASSWORD = Target.the("Input confirmed password").located(By.name("confirmed_password"));
    public static final Target CREATE_ACOUNT = Target.the("Create Acount").located(By.className("Ut3prtt_wDsi7NM_83Jc"));
    public static final Target MESSAGE_PASSWORD_DOESNOT_MATCH = Target.the("Message password doestnot match").located(By.id("confirmed_password-note"));
    public static final Target MESSAGE_EMAIL_INVALID = Target.the("Message email invalid").located(By.id("username-note"));
    public static final Target MESSAGE_PASSWORD_INVALID = Target.the("Message password invalid").located(By.id("new_password-note"));


}
