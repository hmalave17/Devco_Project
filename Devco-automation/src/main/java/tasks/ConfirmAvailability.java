package tasks;

import interactions.Click;
import interactions.SelectRoom;
import interactions.SwitchTabWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;
import userInterfaces.AvailabilityPage;

import static enums.Routs.BUTTON_DOWN;

public class ConfirmAvailability implements Task {

    private WebDriver nav;

    public ConfirmAvailability(WebDriver nav) {
        this.nav = nav;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchTabWindow.change(),
                net.serenitybdd.screenplay.actions.Scroll.to(AvailabilityPage.LABEL_AVAILABILITY_),
                SelectRoom.user(nav, BUTTON_DOWN.getElements()),
                Click.on(AvailabilityPage.BUTTON_BOOK)
        );
    }
    public static ConfirmAvailability booking(WebDriver nav) {
        return Tasks.instrumented(ConfirmAvailability.class, nav);
    }
}
