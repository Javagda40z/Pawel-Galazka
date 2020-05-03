package StayAtHome;

public class Odcinek {

  static Punkt początek;
  static Punkt koniec;

  public Odcinek(Punkt początek, Punkt koniec){
    this.początek= początek;
    this.koniec= koniec;
  }

  public static int getKoniec() {
    return koniec.coordinates;
  }

  public static int getPoczątek() {
    return początek.coordinates;
  }

  public static int długośćOdcinka() {
    int długość = 0;

      if (getPoczątek() > getKoniec()) {
        długość =  getPoczątek() - getKoniec();
       }
      if (getKoniec() > getPoczątek()) {
        długość =  getKoniec() - getPoczątek();
      }
      return długość;
  }

  public static void rysowanieOdcinka(){
    System.out.print("[A]");

    for (int i = 0; i < długośćOdcinka() ; i++) {
      System.out.print(" - ");
    }
    System.out.print("[B]");
  }


}
