package enums;

public enum Words {

    URL_HOME_PAGE("url_home_page"),
    USER("user"),
    GREATER("greater than"),
    LESS("less that"),


    ;


    private String word;
    Words(String word){
        this.word = word;
    }

    public String getWord(){
        return word;
    }


}
