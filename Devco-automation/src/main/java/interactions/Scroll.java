package interactions;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll implements Interaction {

    private WebDriver nav;
    private String element;
    public Scroll(WebDriver nav, String element){
        this.nav = nav;
        this.element = element;
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement elementScroll = nav.findElement(By.id(this.element));
        ((JavascriptExecutor) nav).executeScript("arguments[0].scrollIntoView(true);", elementScroll);
    }
    public static Scroll to(WebDriver nav, String element){
        return new Scroll(nav, element);
    }
}
