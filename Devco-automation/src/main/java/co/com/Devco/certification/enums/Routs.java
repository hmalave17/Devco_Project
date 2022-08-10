package co.com.Devco.certification.enums;

public enum Routs {

    BUTTON_DOWN("//div[@class='hprt-table-column']/table/tbody/tr/td[5]/div[1]/select[1]"),
    INPUT_DESTINY("//div[@class='hero-banner-searchbox']/div/form/div/div/div/div/label/input[@id='ss']"),
    BUTTON_RENT_CAR("//header[@class='bui-header bui-header--logo-large bui-u-hidden-print bui-header--rounded-tabs ']/nav[2]/ul/li[3]/a[@class='bui-tab__link']"),
    INPUT_PLACE("//div[@data-view='rentalcars']/div/div/div/label/input[@name='ss_origin']"),
    BUTTON_SEARCH("//div[@data-view='rentalcars']/div[4]/div[2]/button[@data-sb-id='main']"),
    LIST_SEARCH("//div[@data-view='rentalcars']/div/div/div/ul[@class='c-autocomplete__list sb-autocomplete__list']/li[@data-i='1']");

    ;


    private String elements;

    Routs(String elements) {
        this.elements = elements;
    }

    public String getElements() {
        return elements;
    }
}
