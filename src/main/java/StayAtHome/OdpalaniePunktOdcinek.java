package StayAtHome;

public class OdpalaniePunktOdcinek {

    public static void main(String[] args) { {

        Odcinek odcinek = new Odcinek(new Punkt(),new Punkt());
        System.out.println(odcinek);
        System.out.println(odcinek.getKoniec());
        System.out.println(odcinek.getPoczątek());
        System.out.println();

        }
    }
}
