package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static userInterfaces.BookPage.*;
import static userInterfaces.BookPage.INPUT_EMAIL;

public class FillWrongData implements Task {

    private WebDriver nav;
    private int testCase;

    public FillWrongData(WebDriver nav, int testCase) {
        this.nav = nav;
        this.testCase = testCase;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (testCase) {
            case 1:
                nav.findElement(By.xpath(INPUT_NAME)).sendKeys("Hernan");
                nav.findElement(By.xpath(INPUT_LASTNAME)).sendKeys("Malave");
                nav.findElement(By.xpath(INPUT_EMAIL)).sendKeys("testOneDevco");
                nav.findElement(By.xpath(INPUT_EMAIL_CONFIRM)).sendKeys("testOneDevco");
                break;
            case 2:
                nav.findElement(By.xpath(INPUT_NAME)).sendKeys("Hernan");
                nav.findElement(By.xpath(INPUT_LASTNAME)).sendKeys("Malave");
                nav.findElement(By.xpath(INPUT_EMAIL)).sendKeys("testOneDevco@test.com");
                nav.findElement(By.xpath(INPUT_EMAIL_CONFIRM)).sendKeys("testOneDevco@gmail.com");
                nav.findElement(By.xpath(BUTTON_RADIO)).click();
                break;
            default:
                nav.findElement(By.xpath(BUTTON_NEXT)).click();
                break;
        }

    }

    public static FillWrongData user(WebDriver nav, int testCase) {
        return Tasks.instrumented(FillWrongData.class, nav, testCase);
    }
}
