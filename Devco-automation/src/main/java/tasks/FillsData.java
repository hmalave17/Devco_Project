package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static userInterfaces.BookPage.*;

public class FillsData implements Task {

    private WebDriver nav;
    public FillsData(WebDriver nav){
        this.nav = nav;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        nav.findElement(By.xpath(INPUT_NAME)).sendKeys("Hernan");
        nav.findElement(By.xpath(INPUT_LASTNAME)).sendKeys("Malave");
        nav.findElement(By.xpath(INPUT_EMAIL)).sendKeys("testOneDevco@test.com");
        nav.findElement(By.xpath(INPUT_EMAIL_CONFIRM)).sendKeys("testOneDevco@test.com");
        nav.findElement(By.xpath(BUTTON_RADIO)).click();
        nav.findElement(By.xpath(BUTTON_NEXT)).click();
    }
    public static FillsData user(WebDriver nav){
        return Tasks.instrumented(FillsData.class, nav);
    }
}
