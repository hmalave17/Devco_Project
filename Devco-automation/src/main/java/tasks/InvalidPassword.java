package tasks;

import interactions.Type;
import models.NewUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterfaces.LoginPage;
import userInterfaces.RegisterPage;
import utils.NumberRandom;

public class InvalidPassword implements Task {

    private NewUser newUser;
    public InvalidPassword(NewUser newUser){
        this.newUser = newUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String password = NumberRandom.email(1000,9000);
        actor.attemptsTo(
                Type.on(LoginPage.INPUT_EMAIL, String.format(newUser.getCreateEmail(), NumberRandom.email(10000,99999))),
                Click.on(RegisterPage.BUTTON_CONTINUE_EMAIL),
                Type.on(RegisterPage.INPUT_NEW_PASSWORD, password),
                Type.on(RegisterPage.INPUT_CONFIRMED_PASSWORD, password),
                interactions.Click.on(RegisterPage.CREATE_ACCOUNT)
        );
    }
    public static InvalidPassword format(NewUser newUser){
        return Tasks.instrumented(InvalidPassword.class, newUser);
    }
}
