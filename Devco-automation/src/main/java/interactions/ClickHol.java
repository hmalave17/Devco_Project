package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHol  implements Interaction {

    private Target element;
    public ClickHol(Target element){
        this.element = element;
    }

    WebDriver driver;
    Actions actions = new Actions(driver);

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.navigate().refresh();
    }
    public static Click on(Target element){
        return new Click(element);
    }

}
