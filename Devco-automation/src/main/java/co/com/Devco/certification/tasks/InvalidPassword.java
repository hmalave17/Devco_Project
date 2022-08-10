package co.com.Devco.certification.tasks;

import co.com.Devco.certification.interactions.Type;
import co.com.Devco.certification.models.NewUser;
import co.com.Devco.certification.userInterfaces.LoginPage;
import co.com.Devco.certification.userInterfaces.RegisterPage;
import co.com.Devco.certification.utils.NumberRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

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
                Click.on(RegisterPage.CREATE_ACCOUNT)
        );
    }
    public static InvalidPassword format(NewUser newUser){
        return Tasks.instrumented(InvalidPassword.class, newUser);
    }
}
