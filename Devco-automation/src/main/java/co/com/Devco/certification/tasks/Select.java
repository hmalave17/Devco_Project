package co.com.Devco.certification.tasks;

import co.com.Devco.certification.interactions.Click;
import co.com.Devco.certification.userInterfaces.SelectHotelPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Select implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectHotelPage.BUTTON_CALENDAR_DAY),
                Click.on(SelectHotelPage.BUTTON_SEARCH),
                Click.on(SelectHotelPage.BUTTON_SHOW_PRICE)
        );
    }
    public static Select hotel() {
        return Tasks.instrumented(Select.class);
    }
}
