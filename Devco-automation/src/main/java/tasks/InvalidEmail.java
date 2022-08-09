package tasks;

import interactions.Type;
import models.NewUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterfaces.LoginPage;
import userInterfaces.RegisterPage;

public class InvalidEmail implements Task {

   private NewUser newUser;
   public InvalidEmail(NewUser newUser){
       this.newUser = newUser;
   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.on(LoginPage.INPUT_EMAIL, newUser.getInvalidEmail()),
                Click.on(RegisterPage.BUTTON_CONTINUE_EMAIL)
        );
    }

    public static InvalidEmail format(NewUser newUser) {
        return Tasks.instrumented(InvalidEmail.class, newUser);
    }
}
