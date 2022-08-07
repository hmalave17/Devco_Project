package tasks;

import interactions.Type;
import models.NewUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Shared;
import userInterfaces.RegisterPage;
import utils.NumberRandom;

public class InvalidPassword implements Task {

    @Shared
    NewUser newUser;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.keyValues(String.format(newUser.getEmail(), NumberRandom.email(10000, 90000))).into(RegisterPage.INPUT_EMAIL),
                Click.on(RegisterPage.BUTTON_CONTINUE_EMAIL),
                Type.on(RegisterPage.INPUT_NEW_PASSWORD, newUser.getInvalidPassword()),
                Type.on(RegisterPage.INPUT_CONFIRMED_PASSWORD, newUser.getInvalidPassword()),
                interactions.Click.on(RegisterPage.CREATE_ACOUNT)
        );
    }
    public static InvalidPassword format(){
        return Tasks.instrumented(InvalidPassword.class);
    }
}
