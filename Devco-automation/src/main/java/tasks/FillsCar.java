package tasks;

import interactions.Click;
import interactions.Type;
import models.Transaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userInterfaces.ReservePage;
import utils.NumberRandom;

public class FillsCar implements Task {

    private Transaccion user;
    public FillsCar(Transaccion user){
        this.user = user;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Type.on(ReservePage.INPUT_NAME, user.getName()));
        actor.attemptsTo(SelectFromOptions.byIndex(1).from(ReservePage.INPUT_SR));
        actor.attemptsTo(Type.on(ReservePage.INPUT_EMAIL, user.getEmail()));
        actor.attemptsTo(Type.on(ReservePage.INPUT_LASTNAME, user.getLastName()));
        actor.attemptsTo(Type.on(ReservePage.INPUT_CEL_PHONE, NumberRandom.email(100000000,999999999)));
        actor.attemptsTo(Scroll.to(ReservePage.BUTTON_RESERVE_FINAL));
        actor.attemptsTo(Click.on(ReservePage.BUTTON_RESERVE_FINAL));

    }
    public static FillsCar reserve(Transaccion user){
        return Tasks.instrumented(FillsCar.class, user);
    }
}
