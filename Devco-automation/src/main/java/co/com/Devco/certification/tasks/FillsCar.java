package co.com.Devco.certification.tasks;


import co.com.Devco.certification.interactions.Click;
import co.com.Devco.certification.interactions.Type;
import co.com.Devco.certification.models.Transaccion;
import co.com.Devco.certification.userInterfaces.ReservePage;
import co.com.Devco.certification.utils.NumberRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class FillsCar implements Task {

    private Transaccion user;
    public FillsCar(Transaccion user){
        this.user = user;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Type.on(ReservePage.INPUT_NAME, user.getName()),
                SelectFromOptions.byIndex(1).from(ReservePage.INPUT_SR),
                Type.on(ReservePage.INPUT_EMAIL, user.getEmail()),
                Type.on(ReservePage.INPUT_LASTNAME, user.getLastName()),
                Type.on(ReservePage.INPUT_CEL_PHONE, NumberRandom.email(100000000,999999999)),
                Scroll.to(ReservePage.BUTTON_RESERVE_FINAL),
                Click.on(ReservePage.BUTTON_RESERVE_FINAL)
        );
    }
    public static FillsCar reserve(Transaccion user){
        return Tasks.instrumented(FillsCar.class, user);
    }
}
