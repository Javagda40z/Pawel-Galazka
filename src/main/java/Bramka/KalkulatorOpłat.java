package Bramka;

import Pojazdy.Paliwo;
import Pojazdy.Pojazd;
import Util.Kalkulator;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static Pojazdy.Paliwo.PRĄD;

public class KalkulatorOpłat {

    public static int opłata = 2;

    public int policz(Wjazd wjazd){
        LocalDateTime datawjazd = wjazd.getDatawjazdu();
        LocalDateTime datawyjazdu = LocalDateTime.now();
//        Duration between = Duration.between(datawjazd,datawyjazdu);
        Pojazd pojazd = wjazd.getPojazd();
        long czasNaParkingu = ChronoUnit.HOURS.between(datawjazd, datawyjazdu);

        czasNaParkingu = czasNaParkingu+ Kalkulator.randomHoursbetween(1,24);

        if(czasNaParkingu < 1 || PRĄD.equals(pojazd.getPaliwo())) {
            return 0;
        }
        double mnożnik = policzMnożnikPojazdu(pojazd);
        return (int) (opłata*mnożnik*czasNaParkingu);
    }

    private double policzMnożnikPojazdu(Pojazd pojazd) {
        double mnożnik = 1;

        switch (pojazd.getTyp()){
            case OSOBOWY:
                mnożnik = mnożnik*1;
                break;
            case MOTOCYKL:
                mnożnik = mnożnik*0.5;
                break;
            case CIĘŻAROWY:
                mnożnik = mnożnik*2;
                break;
            default:
                break;
        }

        return mnożnik;
    }
}
