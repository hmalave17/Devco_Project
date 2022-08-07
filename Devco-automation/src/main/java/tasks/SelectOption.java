package tasks;

import interactions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SelectOption  implements Task {

    private Target element;
    public SelectOption(Target element){
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(this.element));
    }
    public static SelectOption menu(Target element){
        return Tasks.instrumented(SelectOption.class, element);
    }
}
