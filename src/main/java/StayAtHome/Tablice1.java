package StayAtHome;

public class Tablice1{

    static int[] tablica = new int[]{6, 3, 5, 7, 1, 1, 7, 9};
    static int tablicaDługość = tablica.length;

    public static void main(String[] args) {

        System.out.println("Suma tablicy: " + liczenieSuma());
        System.out.println("Długość tablicy: " + tablicaDługość);
        System.out.println("Średnia tablicy: " + liczenieśŚrednia());
        System.out.println("Max z tablicy: " + tablicaMax());
        System.out.println("Min z tablicy: " + tablicaMin());

    }

    public static int liczenieSuma(){
        int suma = 0;
        for (int i = 0; i < tablicaDługość; i++) {
            suma = suma + tablica[i];
        } return suma;
    }

    public static int liczenieśŚrednia(){
        int wynik = liczenieSuma()/tablicaDługość;
        return wynik;
    }

    public static int tablicaMax (){
        int max = 0;
        for (int i = 0; i < tablicaDługość; i++) {
            if (tablica[i] > max)
                max = tablica[i];
        } return max;
    }
    public static int tablicaMin (){
        int min = tablica[0];
        for (int i = 0; i < tablicaDługość; i++) {
            if (tablica[i] < min)
                min = tablica[i];
        } return min;

    }
}

