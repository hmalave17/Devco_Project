package tasks;

import interactions.Click;
import interactions.SwitchTabWindow;
import interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterfaces.CarsPage;
import userInterfaces.ReservePage;

public class SearchCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.visible(CarsPage.LABEL_REFERENCE));
        actor.attemptsTo(Scroll.to(CarsPage.BUTTON_OFFER));
        actor.attemptsTo(Click.on(CarsPage.BUTTON_OFFER));
        actor.attemptsTo(SwitchTabWindow.change());
        actor.attemptsTo(Scroll.to(ReservePage.BUTTON_RESERVE));
        actor.attemptsTo(Click.on(ReservePage.BUTTON_RESERVE));
    }
    public static SearchCar user(){
        return Tasks.instrumented(SearchCar.class);
    }
}
