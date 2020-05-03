package Bramka;

import Pojazdy.Pojazd;

import java.time.LocalDateTime;

public class Wjazd {

    private final LocalDateTime datawjazdu;
    private final Pojazd pojazd;

    public Wjazd(LocalDateTime datawjazdu, Pojazd pojazd) {
        this.datawjazdu = datawjazdu;
        this.pojazd = pojazd;
    }

    public LocalDateTime getDatawjazdu() {
        return datawjazdu;
    }

    public Pojazd getPojazd() {
        return pojazd;
    }

}
