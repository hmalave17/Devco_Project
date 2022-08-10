package co.com.Devco.certification.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectHotelPage extends PageObject {
    public static final Target BUTTON_CALENDAR_DAY = Target.the("Button calendar day").located(By.xpath("//div[@class='fa3f76ae6b']/div/table/tbody/tr[2]/td[3]/span[@class='b21c1c6c83']"));
    public static final Target BUTTON_SEARCH = Target.the("Button search").located(By.xpath("//button[@type='submit' and @class='fc63351294 a822bdf511 d4b6b7a9e7 f7db01295e af18dbd5a4 f4605622ad c827b27356']"));
    public static final Target BUTTON_SHOW_PRICE = Target.the("Button show price").located(By.xpath("//div[@class='a68bfa09c2']/child::a[@class='fc63351294 a822bdf511 d4b6b7a9e7 fa565176a8 f7db01295e f4605622ad b2f0d6a80e']"));
    public static final Target MESSAGE_ROOM_MANDATORY =Target.the("Message room mandatory").located(By.xpath("//div[@data-component='hotel/new-rooms-table/select-error-tooltip']/div/p"));
    public static final Target LABEL_PRICE = Target.the("Label price").located(By.xpath("//div[@data-testid='availability-rate-wrapper']/div/div/div/div[2]"));
    public static final Target FILTER_PRICE = Target.the("Filter price").located(By.xpath("//div[@data-testid='filters-sidebar']/div[2]/div/div[@data-filters-item='pri:pri=1']/input[@type='checkbox']"));
    public static final Target LABEL_FILTER = Target.the("label filter").located(By.xpath("//div[@data-testid='filters-sidebar']/div[2]/div/div[@data-filters-item='pri:pri=1']/label/span[3]/div/div/div"));
}
