package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPage extends PageObject {

    public static final Target INPUT_NAME = Target.the("Input name").located(By.xpath("//div[@data-component='bp/personal-details-form/firstname']/input[@name='firstname']"));
    public static final Target INPUT_LAST_NAME = Target.the("Input last name").located(By.xpath("//div[@data-component='bp/personal-details-form/lastname']/input[@name='lastname']"));
    public static final Target INPUT_EMAIL = Target.the("Input email").located(By.xpath("//div[@data-component='bp/personal-details-form/email']/input[@name='email']"));
    public static final Target INPUT_EMAIL_CONFIRM = Target.the("Input email confirm").located(By.xpath("//div[@data-component='bp/personal-details-form/email-confirm']/input[@name='email_confirm']"));
    public static final Target BUTTON_NEXT = Target.the("Button next").located(By.xpath("//div[@class='bui-group bui-spacer--large']/div/div[2]/button[@type='submit' and @name='book']"));
    public static final Target LABEL_INTO_DATA = Target.the("Label into data").located(By.xpath("//div[@class='bui-card bp-card--adress-details-container bui-spacer--large js-booker-details--billing-address  bui-u-bleed@small']/div/header[@class='bui-card__header']"));
    public static final Target MESSAGE_DATA_MANDATORY = Target.the("Message data is mandatory").located(By.xpath("//div[@class='bui-alert bui-alert--error bui-alert--large bui-u-bleed@small bui-spacer--large']/div/span"));
    public static final Target LABEL_EMAIL_INVALID = Target.the("Label email invalid").located(By.xpath("//div[@class='bui-grid bui-grid--size-small']/div[4]/div/p[@role='alert']"));
    public static final Target LABEL_EMAIL_DOEST_NOT_MATCHES = Target.the("Label email doesn't matches").located(By.xpath("//div[@class='bui-grid bui-grid--size-small']/div[6]/div/p[@role='alert']"));


}
