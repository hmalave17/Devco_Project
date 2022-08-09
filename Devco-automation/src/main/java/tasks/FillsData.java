package tasks;

import interactions.Click;
import interactions.Type;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;
import userInterfaces.DataPage;

public class FillsData implements Task {

    private WebDriver nav;

    public FillsData(WebDriver nav) {
        this.nav = nav;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.on(DataPage.INPUT_NAME, "hernan"),
                Type.on(DataPage.INPUT_LAST_NAME, "Malave"),
                Type.on(DataPage.INPUT_EMAIL, "testOneDevco@gmail.com"),
                Type.on(DataPage.INPUT_EMAIL_CONFIRM, "testOneDevco@gmail.com"),
                Scroll.to(DataPage.BUTTON_NEXT),
                Click.on(DataPage.BUTTON_NEXT)
        );
    }

    public static FillsData user(WebDriver nav) {
        return Tasks.instrumented(FillsData.class, nav);
    }
}
