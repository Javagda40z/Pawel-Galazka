package StayAtHome;

public class Odcinek {

  Punkt początek;
  Punkt koniec;

  public Odcinek(Punkt początek, Punkt koniec){
    this.początek= początek;
    this.koniec= koniec;
  }

  public int getKoniec() {
    return koniec.coordinates;
  }

  public int getPoczątek() {
    return początek.coordinates;
  }
}