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
    public static final Target FRAME_NO_ROBOT = Target.the("Iframe no robot").located(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/div[2]//iframe[5]"));
    public static final Target BUTTON_NO_ROBOT = Target.the("Button no Robot").located(By.xpath("/html/body/div/div/div[2]/div[2]/p"));
    public static final Target QUESTION = Target.the("Question").located(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/h3"));



    //
}
