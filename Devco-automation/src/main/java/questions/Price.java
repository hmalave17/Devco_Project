package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import utils.GetText;

import static enums.Words.GREATER;
import static enums.Words.LESS;


public class Price implements Question<String> {

    private Target element;
    private Target elementTwo;

    public Price(Target element, Target elementTwo){
        this.element = element;
        this.elementTwo = elementTwo;
    }

    @Override
    public String answeredBy(Actor actor) {
        return ((GetText.price(elementTwo.resolveFor(actor).getText(), "COP ")) - (GetText.price(element.resolveFor(actor).getText(), "COP 0 - COP ")) >= 0)
                ? GREATER.getWord() : LESS.getWord();
    }
    public static Price room(Target element, Target elementTwo){
        return new Price(element, elementTwo);
    }

}
