package tasks;

import interactions.Click;
import interactions.Type;
import models.Transaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Shared;
import userInterfaces.DataPage;

public class FillWrongData implements Task {

    private int testCase;

    public FillWrongData(int testCase) {
        this.testCase = testCase;
    }

    @Shared
    Transaccion user;

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (testCase) {
            case 1:
                actor.attemptsTo(
                        Type.on(DataPage.INPUT_NAME, user.getName()),
                        Type.on(DataPage.INPUT_LAST_NAME, user.getLastName()),
                        Type.on(DataPage.INPUT_EMAIL, user.getInvalidEmail()),
                        Type.on(DataPage.INPUT_EMAIL_CONFIRM, user.getInvalidEmail()));
                break;
            case 2:
                actor.attemptsTo(
                        Type.on(DataPage.INPUT_NAME, user.getName()),
                        Type.on(DataPage.INPUT_LAST_NAME, user.getLastName()),
                        Type.on(DataPage.INPUT_EMAIL, user.getEmail()),
                        Type.on(DataPage.INPUT_EMAIL_CONFIRM, user.getEmailWrong()));
                break;
            default:
                actor.attemptsTo(
                        Scroll.to(DataPage.BUTTON_NEXT),
                        Click.on(DataPage.BUTTON_NEXT));
                break;
        }
    }

    public static FillWrongData user(int testCase) {
        return Tasks.instrumented(FillWrongData.class, testCase);
    }
}
