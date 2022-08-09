package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import userInterfaces.BookPage;

public class ValidateFilterPrice implements Task {

    private WebDriver nav;
    public ValidateFilterPrice(WebDriver nav){
        this.nav = nav;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        nav.findElement(By.xpath("//div[@class='fa3f76ae6b']/div/table/tbody/tr[2]/td[3]/span[@class='b21c1c6c83']")).click();
        nav.findElement(By.xpath("//*[@id=\"left_col_wrapper\"]/div[1]/div/div/form/div/div[6]/div/button")).click();
        actor.attemptsTo(Click.on(BookPage.A));
    }
    public static ValidateFilterPrice hotel(WebDriver nav){
        return Tasks.instrumented(ValidateFilterPrice.class, nav);
    }
}
