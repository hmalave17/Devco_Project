package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectRoom implements Interaction {

    private WebDriver nav;
    private String element;
    public SelectRoom(WebDriver nav, String element){
        this.nav = nav;
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Select room = new Select(nav.findElement(By.xpath(element)));
        room.selectByIndex(1);
    }
    public static SelectRoom user(WebDriver nav, String element){
        return new SelectRoom(nav, element);
    }
}
