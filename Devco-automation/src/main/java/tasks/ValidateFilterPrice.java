package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterfaces.SelectHotelPage;

public class ValidateFilterPrice implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                interactions.Click.on(SelectHotelPage.BUTTON_CALENDAR_DAY),
                interactions.Click.on(SelectHotelPage.BUTTON_SEARCH),
                Click.on(SelectHotelPage.FILTER_PRICE));
    }

    public static ValidateFilterPrice hotel() {
        return Tasks.instrumented(ValidateFilterPrice.class);
    }
}
