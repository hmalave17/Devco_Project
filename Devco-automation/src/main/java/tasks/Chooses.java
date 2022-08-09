package tasks;

import models.Hooking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static userInterfaces.HomePage.INPUT_DESTINY;


public class Chooses implements Task {

    private WebDriver nav;
    private Hooking user;
    public Chooses(WebDriver nav, Hooking user){
        this.nav = nav;
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        nav.findElement(By.xpath(INPUT_DESTINY)).sendKeys(user.getAddessDestiny());
        nav.findElement(By.xpath(INPUT_DESTINY)).sendKeys(Keys.ENTER);
    }
    public static Chooses destiny(WebDriver nav, Hooking user){
        return Tasks.instrumented(Chooses.class, nav, user);
    }
}
