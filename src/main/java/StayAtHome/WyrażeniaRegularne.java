package StayAtHome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrażeniaRegularne {

    static String tekst1 = "Nabuchodonozor1203";
    static String tekst2 = "Tutenchamon";
    static String tekst3 = "070007123";


    public static void main(String[] args) {

        Pattern sprawdzenieTekstu = Pattern.compile("1");
        Matcher matcher1 = sprawdzenieTekstu.matcher(tekst1);
        Matcher matcher2 = sprawdzenieTekstu.matcher(tekst2);
        Matcher matcher3 = sprawdzenieTekstu.matcher(tekst3);

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());

        System.out.println(czyJestCyfra());

    }

    public static boolean czyJestCyfra() {
        Pattern sprawdzenie0 = Pattern.compile("0");
        Pattern sprawdzenie1 = Pattern.compile("1");
        Matcher matcher0 = sprawdzenie0.matcher(tekst1);
        Matcher matcher1 = sprawdzenie1.matcher(tekst1);
        return matcher0.find() && matcher1.find();
    }
}