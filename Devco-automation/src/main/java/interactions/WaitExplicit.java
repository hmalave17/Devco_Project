package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class WaitExplicit implements Interaction {

    int time;
    public WaitExplicit(int time){
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).waitFor(time).seconds();
    }
    public static WaitExplicit time(int time){
        return new WaitExplicit(time);
    }
}
