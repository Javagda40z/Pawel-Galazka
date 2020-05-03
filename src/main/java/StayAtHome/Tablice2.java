package StayAtHome;

public class Tablice2 {

    public static void main(String[] args) {

        String tablicaImion [] = new String[5];
        tablicaImion[0] = "mateusz";
        tablicaImion[1] = "kasia";
        tablicaImion[2] = "adam";
        tablicaImion[3] = "tomek";
        tablicaImion[4] = "andrzej";

        int tablidaDługość = tablicaImion.length;
        System.out.println("Liczba imion w tablicy: " + tablidaDługość);

        for (int i = 0; i < tablidaDługość; i++) {
            System.out.println(tablicaImion[i]);
        }
        tablicaImion[0] = "piotr";
        System.out.println();
        System.out.println("Zmiana pierwszego imienia na piotr:");

        for (int i = 0; i < tablidaDługość; i++) {
            System.out.println(tablicaImion[i]);
        }

        System.out.println();
        System.out.println("Umiona z dużej litery:");
        for (int i = 0; i < tablidaDługość; i++) {
            System.out.println(tablicaImion[i].substring(0,1).toUpperCase() + tablicaImion[i].substring(1));
        }
    }
}

