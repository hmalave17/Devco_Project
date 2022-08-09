package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookPage extends PageObject {
    public static final Target CALENDAR_DAY_CHECK_IN = Target.the("Calendar day check in").located(By.xpath("//div[@class='fa3f76ae6b']/div/table/tbody/tr[2]/td[3]/span[@class='b21c1c6c83']"));
    public static final Target BUTTON_SEARCH = Target.the("Card first").located(By.xpath("//*[@id=\"left_col_wrapper\"]/div[1]/div/div/form/div/div[6]/div/button"));
    public static final Target BUTTON_AVAILABILITY  = Target.the("Button availability").located(By.xpath("//div[@class='a68bfa09c2']/child::a[@class='fc63351294 a822bdf511 d4b6b7a9e7 fa565176a8 f7db01295e f4605622ad b2f0d6a80e']"));
    public static final Target A = Target.the("A").located(By.xpath("//div[@data-testid='filters-sidebar']/div[2]/div/div[@data-filters-item='pri:pri=1']/input[@type='checkbox']"));
    public static final Target AA = Target.the("AA").located(By.xpath("//div[@data-testid='filters-sidebar']/div[2]/div/div[@data-filters-item='pri:pri=1']/label/span[3]/div/div/div"));
    public static final Target LABEL_PRICE = Target.the("Label price").located(By.xpath("//div[@data-testid='availability-rate-wrapper']/div/div/div/div[2]"));
    public static final String LABEL_AVAILABILITY="availability_target";
    public static final String BUTTON_DOWN="//div[@class='hprt-table-column']/table/tbody/tr/td[5]/div[1]/select[1]";
    public static final String BUTTON_BOOKING = "//div[@class='hprt-reservation-cta']/child::button[@Type='submit']";
    public static final String INPUT_NAME = "//div[@data-component='bp/personal-details-form/firstname']/input[@name='firstname']";
    public static final String INPUT_LASTNAME = "//div[@data-component='bp/personal-details-form/lastname']/input[@name='lastname']";
    public static final String INPUT_EMAIL = "//div[@data-component='bp/personal-details-form/email']/input[@name='email']";
    public static final String INPUT_EMAIL_CONFIRM = "//div[@data-component='bp/personal-details-form/email-confirm']/input[@name='email_confirm']";
    public static final String BUTTON_RADIO = "//div[@class='bui-form__group bp-form-group bp-form-group__notstayer_false   ']";
    public static final String BUTTON_NEXT = "//div[@class='bui-group bui-spacer--large']/div/div[2]/button[@name='book']";
    public static final Target LABEL_INTO_DATA = Target.the("Label into data").located(By.xpath("//div[@class='bui-card bp-card--adress-details-container bui-spacer--large js-booker-details--billing-address  bui-u-bleed@small']/div/header[@class='bui-card__header']"));
    public static final Target MESSAGE_ROOM_MANDATORY =Target.the("Message room mandatory").located(By.xpath("//div[@data-component='hotel/new-rooms-table/select-error-tooltip']/div/p"));
    public static final Target MESSAGE_DATA_MANDATORY = Target.the("Message data is mandatory").located(By.xpath("//div[@class='bui-alert bui-alert--error bui-alert--large bui-u-bleed@small bui-spacer--large']/div/span"));
    public static final Target LABEL_EMAIL_INVALID = Target.the("Label email invalid").located(By.xpath("//div[@class='bui-grid bui-grid--size-small']/div[4]/div/p[@role='alert']"));
    public static final Target LABEL_EMAIL_DOEST_NOT_MATCHES = Target.the("Label email doesn't matches").located(By.xpath("//div[@class='bui-grid bui-grid--size-small']/div[6]/div/p[@role='alert']"));
}
