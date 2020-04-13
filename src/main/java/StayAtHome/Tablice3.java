package StayAtHome;

import java.util.Arrays;

public class Tablice3 {

    public static void main(String[] args) {

        int tablica1 [] = new int[]{1, 2, 3, 4, 5, 6};
        int tablica2 [] = new int[]{2, 3, 5, 6, 5, 9};

        int tablicaDługość1 = tablica1.length;
        for (int i = 0; i < tablicaDługość1; i++) {
            System.out.print(tablica1[i]+" ");
        }
        System.out.println("\n");

        int[][] tablica3 = new int[][]{tablica1,tablica2};
        int tablicaDługość3 = tablica3.length;

        for (int i = 0; i < tablicaDługość3; i++) {
            System.out.println(Arrays.toString(tablica3[i]) +" ");
        }

    }
}
