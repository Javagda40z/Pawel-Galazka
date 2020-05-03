package Projekt;

import Bramka.Bramka;
import Bramka.RejestrPojazdów;
import Pojazdy.Motocykl;
import Pojazdy.Paliwo;
import Pojazdy.Samochód;
import Bramka.KalkulatorOpłat;
import Bramka.Raport;

public class Application {

    // Sprawdzenie czy rejestracja poprawna
    // Sprawdzenie czy jest miejsce
    // dodatkowy kalkulator
    // wydawanie reszty
    // wzywanie policji?
    // nie pozwalaąc na zmieną kalkulatora jak są pojazdy
    // stosować stary kalkulator do pojazdów które wjechały
    // wydawanie reszty
    // generowanie raportu do pliku?
    // raport co zostałao na parkingu

    public static void main(String[] args) {

       RejestrPojazdów rejestrPojazdów = new RejestrPojazdów();
       Bramka bramka = new Bramka(rejestrPojazdów);
       bramka.setKalkulatorOpłat(new KalkulatorOpłat());
       
        Motocykl motocykl1 = new Motocykl("GD12345", Paliwo.BENZYNA);
        Samochód samochód1 = new Samochód("GD33441", Paliwo.ROPA);
        Samochód samochód2 = new Samochód("GD33211", Paliwo.BENZYNA);

        bramka.wjazd(motocykl1);
        bramka.wjazd(samochód1);
        bramka.wjazd(samochód2);

        bramka.wyjazd(samochód1, 11);
        bramka.wyjazd(samochód2,50);

        bramka.wjazd(samochód1);
        bramka.wjazd(motocykl1);

        Raport raport = bramka.przygotujRaport();
        raport.wyświetl(); // Raczej powinna być klasa od wyświetlania raportu


    }
}
