package StayAtHome;

public class Tablice1{

    static int[] tablica1 = new int[]{6, 3, 5, 7, 1, 1, 7, 9};
    static int[] tablica2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int tablicaDługość1 = tablica1.length;
    static int tablicaDługość2 = tablica2.length;

    public static void main(String[] args) {

        System.out.println("Suma tablicy: " + liczenieSuma1());
        System.out.println("Długość tablicy: " + tablicaDługość1);
        System.out.println("Średnia tablicy: " + liczenieŚrednia());
        System.out.println("Max z tablicy: " + tablicaMax());
        System.out.println("Min z tablicy: " + tablicaMin());
        System.out.println("Suma dwóch tablic: " + dwieSumy());
        System.out.println("Mnożenie elementów Tablica1: " + mnożenieTablica1());
        System.out.println("Mnożenie elementów Tablica2: " + mnożenieTablica2());

    }

//    Metody lepiej w nowej classie pewnie?

    public static int liczenieSuma1(){
        int suma = 0;
        for (int i = 0; i < tablicaDługość1; i++) {
            suma = suma + tablica1[i];
        } return suma;
    }

    public static int liczenieSuma2(){
        int suma = 0;
        for (int i = 0; i < tablicaDługość2; i++) {
            suma = suma + tablica2[i];
        } return suma;
    }

    public static int dwieSumy(){
        int suma;
        suma = liczenieSuma1()+liczenieSuma2();
        return suma;
    }

    public static int liczenieŚrednia(){
        int wynik = liczenieSuma1()/ tablicaDługość1;
        return wynik;
    }

    public static int tablicaMax (){
        int max = 0;
        for (int i = 0; i < tablicaDługość1; i++) {
            if (tablica1[i] > max)
                max = tablica1[i];
        } return max;
    }

    public static int tablicaMin (){
        int min = tablica1[0];
        for (int i = 0; i < tablicaDługość1; i++) {
            if (tablica1[i] < min)
                min = tablica1[i];
        } return min;
    }

    public static int mnożenieTablica1(){
        int wynik = 1;
        for (int i = 0; i < tablicaDługość1; i++) {
            wynik = wynik * tablica1[i];
        } return wynik;
    }
    public static int mnożenieTablica2(){
        int wynik = 1;
        for (int i = 0; i < tablicaDługość2; i++) {
            wynik = wynik * tablica2[i];
        } return wynik;
    }

}

