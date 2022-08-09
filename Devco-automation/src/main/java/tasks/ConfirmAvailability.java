package tasks;

import interactions.Scroll;
import interactions.SwitchTabWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static userInterfaces.BookPage.*;

public class ConfirmAvailability implements Task {

    private WebDriver nav;
    public ConfirmAvailability(WebDriver nav){
        this.nav = nav;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SwitchTabWindow.change());
        actor.attemptsTo(Scroll.to(nav, LABEL_AVAILABILITY));
        Select room = new Select(nav.findElement(By.xpath(BUTTON_DOWN)));
        room.selectByIndex(1);
        nav.findElement(By.xpath(BUTTON_BOOKING)).click();
    }
    public static ConfirmAvailability booking(WebDriver nav){
        return Tasks.instrumented(ConfirmAvailability.class, nav);
    }
}
