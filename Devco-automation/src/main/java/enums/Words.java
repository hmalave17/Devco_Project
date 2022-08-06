package enums;

public enum Words {

    URL_HOME_PAGE("url_home_page"),
    USER("user");


    private String word;
    Words(String word){
        this.word = word;
    }

    public String getWord(){
        return word;
    }


}
