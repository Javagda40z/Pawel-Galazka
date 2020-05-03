package StayAtHome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrażeniaRegularne {

    static String tekst1 = "Nabuchodonozor1203";
    static String tekst2 = "Tutenchamon";
    static String tekst3 = "070007123";

    static String kot = "Czarny i biały kot";


    public static void main(String[] args) {

        Pattern sprawdzenieTekstu = Pattern.compile("1");
        Matcher matcher1 = sprawdzenieTekstu.matcher(tekst1);
        Matcher matcher2 = sprawdzenieTekstu.matcher(tekst2);
        Matcher matcher3 = sprawdzenieTekstu.matcher(tekst3);

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());

        System.out.println(czyJestCyfra());
        System.out.println("Czy " +tekst1 + " zawiera jakieś cyfry? " + czyJestCyfra2(tekst1));
        System.out.println("Czy " +tekst2 + " zawiera jakieś cyfry? " + czyJestCyfra2(tekst2));
        System.out.println("Czy " +tekst3 + " zawiera jakieś cyfry? " + czyJestCyfra2(tekst3));

        System.out.println("Czy " +tekst1 + " zawiera cyfry i litery? " + czyLiteryOrazCyfry(tekst1));
        System.out.println("Czy " +tekst2 + " zawiera cyfry i litery? " + czyLiteryOrazCyfry(tekst2));
        System.out.println("Czy " +tekst3 + " zawiera cyfry i litery? " + czyLiteryOrazCyfry(tekst3));

        System.out.println("Czy " +tekst1 + " zawiera jakieś litery? " + czyJestLitera(tekst1));
        System.out.println("Czy " +tekst2 + " zawiera jakieś litery? " + czyJestLitera(tekst2));
        System.out.println("Czy " +tekst3 + " zawiera jakieś litery? " + czyJestLitera(tekst3));

        tekstBezSpacji(kot);

    }

    public static boolean czyJestCyfra() {
        Pattern sprawdzenie0 = Pattern.compile("0");
        Pattern sprawdzenie1 = Pattern.compile("1");
        Matcher matcher0 = sprawdzenie0.matcher(tekst1);
        Matcher matcher1 = sprawdzenie1.matcher(tekst1);
        return matcher0.find() && matcher1.find();
    }

    public static boolean czyJestCyfra2(String A){
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(A);
        return matcher.find();
    }

    public static boolean czyLiteryOrazCyfry(String A){
        Pattern pattern = Pattern.compile("\\d");
        Pattern pattern1 = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(A);
        Matcher matcher1 = pattern1.matcher(A);
        return matcher.find()&&matcher1.find();
    }

    public static boolean czyJestLitera(String A){
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(A);
        return matcher.find();
    }

    public static void tekstBezSpacji(String A){ ;
        System.out.println(A.replace(" ",""));
    }




}