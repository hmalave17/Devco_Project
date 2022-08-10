package co.com.Devco.certification.tasks;

import co.com.Devco.certification.interactions.Click;
import co.com.Devco.certification.interactions.SelectIndex;
import co.com.Devco.certification.interactions.SwitchTabWindow;
import co.com.Devco.certification.userInterfaces.AvailabilityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import static co.com.Devco.certification.enums.Routs.BUTTON_DOWN;


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
                SelectIndex.user(nav, BUTTON_DOWN.getElements(),1),
                Click.on(AvailabilityPage.BUTTON_BOOK)
        );
    }
    public static ConfirmAvailability booking(WebDriver nav) {
        return Tasks.instrumented(ConfirmAvailability.class, nav);
    }
}
