package tasks;

import interactions.Scroll;
import interactions.SwitchTabWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static userInterfaces.BookPage.BUTTON_BOOKING;
import static userInterfaces.BookPage.LABEL_AVAILABILITY;

public class Room implements Task {

    private WebDriver nav;
    public Room(WebDriver nav){
        this.nav=nav;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SwitchTabWindow.change());
        actor.attemptsTo(Scroll.to(nav, LABEL_AVAILABILITY));
        nav.findElement(By.xpath(BUTTON_BOOKING)).click();
    }
    public static Room mandatory(WebDriver nav){
        return Tasks.instrumented(Room.class, nav);
    }
}
