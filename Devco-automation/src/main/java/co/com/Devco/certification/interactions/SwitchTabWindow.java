package co.com.Devco.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;

public class SwitchTabWindow implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> tab = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(tab.get(1));

    }
    public static SwitchTabWindow change () {
        return Tasks.instrumented(SwitchTabWindow.class);
    }

}
