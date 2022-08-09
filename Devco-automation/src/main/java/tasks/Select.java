package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select implements Task {

    private WebDriver nav;
    public Select(WebDriver nav){
        this.nav = nav;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        nav.findElement(By.xpath("//div[@class='fa3f76ae6b']/div/table/tbody/tr[2]/td[3]/span[@class='b21c1c6c83']")).click();
        nav.findElement(By.xpath("//*[@id=\"left_col_wrapper\"]/div[1]/div/div/form/div/div[6]/div/button")).click();
        nav.findElement(By.xpath("//div[@class='a68bfa09c2']/child::a[@class='fc63351294 a822bdf511 d4b6b7a9e7 fa565176a8 f7db01295e f4605622ad b2f0d6a80e']")).click();
    }
    public static Select hotel(WebDriver nav){
        return Tasks.instrumented(Select.class, nav);
    }
}
