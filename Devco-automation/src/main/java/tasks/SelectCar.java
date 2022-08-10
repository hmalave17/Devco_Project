package tasks;

import models.Transaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static enums.Routs.*;

public class SelectCar implements Task {

    private Transaccion user;
    private WebDriver nav;
    public SelectCar(Transaccion user, WebDriver nav){
        this.user = user;
        this.nav = nav;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        nav.findElement(By.xpath(BUTTON_RENT_CAR.getElements())).click();
        nav.findElement(By.xpath(INPUT_PLACE.getElements())).sendKeys(user.getPlaceDelivery());
        BrowseTheWeb.with(nav).waitFor(2).seconds();
        nav.findElement(By.xpath(INPUT_PLACE.getElements())).sendKeys(Keys.ARROW_DOWN);
        nav.findElement(By.xpath(INPUT_PLACE.getElements())).sendKeys(Keys.ARROW_DOWN);
        nav.findElement(By.xpath(INPUT_PLACE.getElements())).sendKeys(Keys.ENTER);
        nav.findElement(By.xpath(BUTTON_SEARCH.getElements())).click();

    }
    public static SelectCar option(Transaccion user, WebDriver nav){
        return Tasks.instrumented(SelectCar.class, user, nav);
    }
}
