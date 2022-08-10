package co.com.Devco.certification.enums;

public enum Label {

    INTO_DATA("Introduce tus datos"),

    ;

    private String sentence;
    Label(String sentence){
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }
}
