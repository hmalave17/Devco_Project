package enums;

public enum Routs {

    BUTTON_DOWN("//div[@class='hprt-table-column']/table/tbody/tr/td[5]/div[1]/select[1]"),
    INPUT_DESTINY("//div[@class='hero-banner-searchbox']/div/form/div/div/div/div/label/input[@id='ss']"),
    ;


    private String elements;

    Routs(String elements) {
        this.elements = elements;
    }

    public String getElements() {
        return elements;
    }
}
