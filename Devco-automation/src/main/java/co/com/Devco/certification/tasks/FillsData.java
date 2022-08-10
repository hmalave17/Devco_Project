package co.com.Devco.certification.tasks;

import co.com.Devco.certification.interactions.Click;
import co.com.Devco.certification.interactions.Type;
import co.com.Devco.certification.models.Transaccion;
import co.com.Devco.certification.userInterfaces.DataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Shared;

public class FillsData implements Task {

    @Shared
    Transaccion user;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.on(DataPage.INPUT_NAME, user.getName()),
                Type.on(DataPage.INPUT_LAST_NAME, user.getLastName()),
                Type.on(DataPage.INPUT_EMAIL, user.getEmail()),
                Type.on(DataPage.INPUT_EMAIL_CONFIRM, user.getEmail()),
                Scroll.to(DataPage.BUTTON_NEXT),
                Click.on(DataPage.BUTTON_NEXT)
        );
    }
    public static FillsData user() {
        return Tasks.instrumented(FillsData.class);
    }
}
