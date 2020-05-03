package Bramka;

import Pojazdy.Typ;

import java.util.EnumMap;
import java.util.Map;

public class Raport {

    private int zarobek;
    private int koszt;

    Map<Typ, Integer> ilośćPojazdów = new EnumMap<>(Typ.class);

    public Map<Typ, Integer> getIlośćPojazdów() {
        return ilośćPojazdów;
    }

    public int getZarobek() {
        return zarobek;
    }

    public int getKoszt() {
        return koszt;
    }

    public void dodajKase (int kasa){
        zarobek+=kasa; // zarobek = zarobek + kasa
    }

    public void dodajKoszt (int koszt){
        this.koszt+=koszt;
    }
    public void dodajPojazd(Typ typ){

        if (ilośćPojazdów.containsKey(typ)) {
            Integer licznik = ilośćPojazdów.get(typ);
            licznik++;
            ilośćPojazdów.put(typ, licznik);
        } else {
            ilośćPojazdów.put(typ, 1);
            }
        }

    public void wyświetl() {
        System.out.println("Zarobiona kasa: " +zarobek);
        System.out.println("Koszt: " + koszt);
        for (Typ typ : ilośćPojazdów.keySet()) {
            System.out.println("Pojazdów o typie " + typ.name() + " jest: " + ilośćPojazdów.get(typ));
        }

    }
}

