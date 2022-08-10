package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectIndex implements Interaction {

    private WebDriver nav;
    private String element;
    private int index;
    public SelectIndex(WebDriver nav, String element, int index){
        this.nav = nav;
        this.element = element;
        this.index = index;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Select room = new Select(nav.findElement(By.xpath(element)));
        room.selectByIndex(index);
    }
    public static SelectIndex user(WebDriver nav, String element, int index){
        return new SelectIndex(nav, element, index);
    }
}
