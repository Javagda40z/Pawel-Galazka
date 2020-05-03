package Bramka;

import Pojazdy.Pojazd;

public class Bramka implements Szlaban {

    private RejestrPojazdów rejestrPojazdów;
    private KalkulatorOpłat kalkulatorOpłat;
    private final Raport raport;

    public Bramka(RejestrPojazdów rejestrPojazdów) {
        this.rejestrPojazdów = rejestrPojazdów;
        raport = new Raport();
    }

    @Override
    public void wjazd(Pojazd pojazd) {

        Boolean czyWjechał = rejestrPojazdów.wpisz(pojazd);
        if (!czyWjechał){
            zawołajPomoc(pojazd);
        } else {
            System.out.println("Pojazd o nr rejestracyjnym " + pojazd.getRejestracja() + " wjechał na parking");
//            raport.dodajPojazd(pojazd.getTyp());
        }
    }

    private void zawołajPomoc(Pojazd pojazd) {
        System.out.println("Wołam o pomoc dla pojazdu o nr rejestraycjnym " + pojazd.getRejestracja());
    }

    @Override
    public void wyjazd(Pojazd pojazd, int zapłata) {
        Wjazd wjazd = rejestrPojazdów.wypisz(pojazd);
        int koszt = kalkulatorOpłat.policz(wjazd);

        if(koszt > zapłata) {
            zawołajPomoc(pojazd);
        }
        raport.dodajPojazd(pojazd.getTyp());
        raport.dodajKase(zapłata);
        raport.dodajKoszt(koszt);
        System.out.println("Wyjeżdza pojazd o nr rejestracyjnym: " + wjazd.getPojazd().getRejestracja() + " zapłacono " + koszt);

    }

    public void setKalkulatorOpłat(KalkulatorOpłat kalkulatorOpłat) {
        this.kalkulatorOpłat = kalkulatorOpłat;
    }

    public Raport przygotujRaport(){
        return raport;
    }
}
