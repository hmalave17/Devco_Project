package tasks;

import models.NewUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Shared;
import userInterfaces.RegisterPage;

public class InvalidEmail implements Task {

    @Shared
    NewUser newUser;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(newUser.getInvalidEmail()).into(RegisterPage.INPUT_EMAIL),
                Click.on(RegisterPage.BUTTON_CONTINUE_EMAIL)
        );
    }

    public static InvalidEmail format() {
        return Tasks.instrumented(InvalidEmail.class);
    }
}
