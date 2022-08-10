package co.com.Devco.certification.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarsPage extends PageObject {

    public static final Target LABEL_REFERENCE = Target.the("Label reference").located(By.xpath("//div[@class='SM_4049aff0']"));
    public static final Target BUTTON_OFFER = Target.the("Button offer").located(By.xpath("//div[@class='SM_b770f0b1 SM_4547992c SM_d12d1fe9 vcc-results-card__price-and-usp-and-view-deal']/button[@type='button']"));


}
