package tasks;

import interactions.Type;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterfaces.LoginPage;
import userInterfaces.RegisterPage;

public class Login implements Task {

    private String email , password;
    public Login(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(this.email).into(RegisterPage.INPUT_EMAIL),
                Click.on(RegisterPage.BUTTON_CONTINUE_EMAIL),
                Type.on(LoginPage.INPUT_PASSWORD, this.password),
                interactions.Click.on(LoginPage.BUTTON_LOGIN)
        );
    }

    public static Login user(String email, String password){
        return Tasks.instrumented(Login.class, email, password);
    }
}
