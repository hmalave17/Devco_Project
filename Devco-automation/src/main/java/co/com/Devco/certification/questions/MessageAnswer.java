package co.com.Devco.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class MessageAnswer implements Question<String> {

    private Target element;
    MessageAnswer(Target element){
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return this.element.resolveFor(actor).getText();
    }

    public static MessageAnswer is(Target element){
        return new MessageAnswer(element);
    }
}
