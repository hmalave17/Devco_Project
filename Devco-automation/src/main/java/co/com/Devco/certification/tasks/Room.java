package co.com.Devco.certification.tasks;

import co.com.Devco.certification.interactions.Click;
import co.com.Devco.certification.interactions.SwitchTabWindow;
import co.com.Devco.certification.userInterfaces.AvailabilityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Room implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchTabWindow.change(),
                net.serenitybdd.screenplay.actions.Scroll.to(AvailabilityPage.LABEL_AVAILABILITY_),
                Click.on(AvailabilityPage.BUTTON_BOOK)
                );
    }
    public static Room mandatory(){
        return Tasks.instrumented(Room.class);
    }
}
