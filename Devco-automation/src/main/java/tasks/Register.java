package tasks;

import interactions.Type;
import interactions.WaitExplicit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterfaces.RegisterPage;

public class Register implements Task {

    private String email, password;
    public Register(String email, String password ){
        this.email = email;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.keyValues(email).into(RegisterPage.INPUT_EMAIL));
        actor.attemptsTo(Click.on(RegisterPage.BUTTON_CONTINUE_EMAIL));
        actor.attemptsTo(Type.on(RegisterPage.INPUT_NEW_PASSWORD, password));
        actor.attemptsTo(WaitExplicit.time(2));
        actor.attemptsTo(Type.on(RegisterPage.INPUT_CONFIRMED_PASSWORD, password));
        actor.attemptsTo(interactions.Click.on(RegisterPage.CREATE_ACOUNT));
        actor.attemptsTo(WaitExplicit.time(6451));
    }

    public static Register user(String email, String password){
        return Tasks.instrumented(Register.class, email, password);
    }
}
