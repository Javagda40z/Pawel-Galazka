package StayAtHome;

import java.time.LocalDate;

public class DataCzas {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println("Od początku roku minęło: " + liczbaDniOdPoczątkuRoku() + " dni");
        System.out.println("Do końca roku jeszcze: " + liczbaDniDoKońcaRoku() + " dni");

        System.out.println("Czy data 15.06.2020 jest przed dzisiejszą datą? Odpowiedź: " +czyDataJestPrzedDrugą());

    }

    public static Integer liczbaDniOdPoczątkuRoku(){
        LocalDate teraz = LocalDate.now();
        Integer tenDzień = teraz.getDayOfYear();
        LocalDate początekRoku = LocalDate.of(2020,1,1);
        Integer tamtenDzień = początekRoku.getDayOfYear();
        Integer różnicaCzasu = tenDzień-tamtenDzień;
        return różnicaCzasu;
    }

    public static Integer liczbaDniDoKońcaRoku(){
        LocalDate teraz = LocalDate.now();
        Integer tenDzień = teraz.getDayOfYear();
        LocalDate ostatniDzień = LocalDate.of(2020,12,31);
        Integer tamtenDzień = ostatniDzień.getDayOfYear();
        Integer różnicaCzasu = tamtenDzień-tenDzień;
        return różnicaCzasu;
    }

    public static String czyDataJestPrzedDrugą(){
        LocalDate teraz = LocalDate.now();
        LocalDate potem = LocalDate.of(2020,6,15);
        boolean po = teraz.isAfter(potem);
        if (po == true){
            return "tak";}
        else {
            return "nie";}
        }



}
