package tasks;

import interactions.Type;
import models.NewUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterfaces.LoginPage;
import userInterfaces.RegisterPage;

public class LoginFail implements Task {

    private NewUser newUser;
    public LoginFail(NewUser newUser){
        this.newUser = newUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.on(LoginPage.INPUT_EMAIL, newUser.getEmail()),
                Click.on(RegisterPage.BUTTON_CONTINUE_EMAIL),
                Type.on(LoginPage.INPUT_PASSWORD, newUser.getWrongPassord()),
                interactions.Click.on(LoginPage.BUTTON_LOGIN)
        );
    }
    public static LoginFail user(NewUser newUser){
        return Tasks.instrumented(LoginFail.class, newUser);
    }
}
