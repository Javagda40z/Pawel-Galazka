package StayAtHome;

public class OdpalaniePunktOdcinek {

    public static void main(String[] args) { {

        Odcinek odcinek = new Odcinek(new Punkt(),new Punkt());
        System.out.println(odcinek);
        System.out.println("Pierwszy punkt miejsce: " + odcinek.getPoczątek());
        System.out.println("Drugi punkt miejsce: " + odcinek.getKoniec());
        System.out.println();
        System.out.println("Długość odcinka: " + odcinek.długośćOdcinka());
        Odcinek.rysowanieOdcinka();


        }
    }
}
