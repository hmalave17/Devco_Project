package co.com.Devco.certification.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservePage extends PageObject {

    public static final Target BUTTON_RESERVE = Target.the("Button reserve").located(By.xpath("//div[@class='IM_d10c8f3d IM_e5ce4fa6 IM_efdf9b06 IM_58d78c5e IM_7d6a24ce ins-u-max-width']/div/button[@data-testid='checkout-cta-without-insurance']"));
    public static final Target INPUT_NAME = Target.the("Input name").located(By.xpath("//div[@class='CM_a12582e3']/input[@name='email']"));
    public static final Target INPUT_SR = Target.the("Input sr").located(By.xpath("//div[@class='CM_6839f7e5 CM_7dbdfec2']/div/select[@name='title']"));
    public static final Target INPUT_EMAIL = Target.the("Input email").located(By.xpath("//div[@class='CM_13d1895a']/div/input[@name='email']"));
    public static final Target INPUT_LASTNAME = Target.the("Input lastname").located(By.xpath("//div[@class='CM_a12582e3']/input[@name='lastName']"));
    public static final Target INPUT_CEL_PHONE = Target.the("Input cel phone").located(By.xpath("//div[@class='CM_a12582e3']/input[@name='telephoneNumber']"));
    public static final Target BUTTON_RESERVE_FINAL = Target.the("Buton reserve final").located(By.xpath("//div[@class='CM_b770f0b1 CM_4547992c CM_d12d1fe9 bgui-u-pb-large']/form/div[8]/button[@data-testid='checkout-form-submit-button']"));
}
