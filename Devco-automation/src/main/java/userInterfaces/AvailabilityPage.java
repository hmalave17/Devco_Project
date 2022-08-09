package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AvailabilityPage extends PageObject {

    public static final Target LABEL_AVAILABILITY_ = Target.the("label availability").located(By.xpath("//div[@class='bui-grid bui-grid--size-small hotelchars']/div[7]/div[2]/div/h2[@id='availability_target']"));
    public static final Target BUTTON_BOOK = Target.the("Button book").located(By.xpath("//div[@class='hprt-reservation-cta']/button[@data-tooltip-class='submit_holder_button_tooltip']"));

}
