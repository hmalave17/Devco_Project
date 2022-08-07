package utils;

public class GetText {

    public static String required(String text, String separador, int position){
        String requiredText = null;
        String [] cadenaText = text.split(separador);
        requiredText = cadenaText[position];
        return requiredText;
    }
}
