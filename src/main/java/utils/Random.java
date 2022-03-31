package utils;

public class Random {
    public static String generate() {
        int min = 10000;
        int max = 90000;

        String random_int = String.valueOf((int)Math.floor(Math.random()*(max-min+1)+min));
        return ""+ random_int;
    }
}
