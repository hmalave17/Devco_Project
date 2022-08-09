package tasks;

import interactions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userInterfaces.SelectHotelPage;

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
