package utils;


import java.security.SecureRandom;

public class NumberRandom {

    private static SecureRandom nr = new SecureRandom();

    private NumberRandom(){}

    public static String email(long min, long max){
        return String.valueOf(min + nr.nextInt((int) max));
    }

    public static String password(){
        return "testOne" + nr.nextInt(999);
    }


}
