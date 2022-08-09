package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static userInterfaces.HomePage.INPUT_DESTINY;


public class Chooses implements Task {

    private WebDriver nav;
    public Chooses(WebDriver nav){
        this.nav = nav;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        nav.findElement(By.xpath(INPUT_DESTINY)).sendKeys("Miami, Florida, Estados Unidos");
        nav.findElement(By.xpath(INPUT_DESTINY)).sendKeys(Keys.ENTER);
    }
    public static Chooses destiny(WebDriver nav){
        return Tasks.instrumented(Chooses.class, nav);
    }
}
