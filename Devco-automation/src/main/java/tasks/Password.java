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

public class Password implements Task {

    private NewUser newUser;
    public Password(NewUser newUser){
        this.newUser = newUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.on(LoginPage.INPUT_EMAIL, String.format(newUser.getCreateEmail(), NumberRandom.email(10000,99999))),
                Click.on(RegisterPage.BUTTON_CONTINUE_EMAIL),
                Type.on(RegisterPage.INPUT_NEW_PASSWORD, newUser.getPassword()),
                Type.on(RegisterPage.INPUT_CONFIRMED_PASSWORD, newUser.getWrongPassord()),
                interactions.Click.on(RegisterPage.CREATE_ACCOUNT)
        );
    }
    public static Password incorrect(NewUser newUser){
        return Tasks.instrumented(Password.class, newUser);
    }
}
