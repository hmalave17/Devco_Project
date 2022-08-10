package co.com.Devco.certification.tasks;


import co.com.Devco.certification.interactions.Type;
import co.com.Devco.certification.models.NewUser;
import co.com.Devco.certification.userInterfaces.LoginPage;
import co.com.Devco.certification.userInterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


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
