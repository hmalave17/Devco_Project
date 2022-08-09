package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target BUTTON_REGISTER = Target.the("Button main menu").located(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a/span"));
    public static final Target BUTTON_LOGIN = Target.the("Button login").located(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[6]/a/span"));
    public static final Target LABEL_NAME_AVATAR = Target.the("Label name avatar").located(By.className("bui-avatar-block__title"));


}
