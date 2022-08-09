package utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class GetText {

    private GetText(){}

    public static String required(String text, String separador, int position){
        String [] cadenaText = text.split(separador);
        return cadenaText[position];
    }

    public static Integer price(String text, String tex1){
        String price = text.replace(tex1, "");
        return Integer.parseInt(price.replace(".",""));
    }

    public static String element(Target element, Actor actor){
        WebElementFacade option = element.resolveFor(actor);
        String [] options = option.toString().split("By.xpath:");
        return options[1];
    }
}
