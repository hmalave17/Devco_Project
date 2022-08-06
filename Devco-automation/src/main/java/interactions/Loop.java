package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class Loop implements Interaction {

    private Target optionsList;
    private String option;

    public Loop(Target optionsList, String option){
        this.optionsList = optionsList;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> optionslist = this.optionsList.resolveAllFor(actor);
        for(WebElementFacade options : optionslist){
            actor.attemptsTo(Scroll.to(options));
            if(options.getText().equalsIgnoreCase(this.option)){
                actor.attemptsTo(Click.on(options));
                break;
            }
        }
    }
    public static Loop list(Target optionsList, String option){
        return new Loop(optionsList, option);
    }
}
