package tasks;

import models.Transaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static enums.Routs.INPUT_DESTINY;


public class Chooses implements Task {

    private WebDriver nav;
    private Transaccion user;
    public Chooses(WebDriver nav, Transaccion user){
        this.nav = nav;
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        nav.findElement(By.xpath(INPUT_DESTINY.getElements())).sendKeys(user.getAddessDestiny());
        nav.findElement(By.xpath(INPUT_DESTINY.getElements())).sendKeys(Keys.ENTER);
    }
    public static Chooses destiny(WebDriver nav, Transaccion user){
        return Tasks.instrumented(Chooses.class, nav, user);
    }
}
