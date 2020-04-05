package Application2;


import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {

//        int tablica[] = new int []{1,2,3};
//        System.out.println(Arrays.toString(tablica));
//        zamienPierwsztITrzeciElement(tablica);
//        System.out.println(Arrays.toString(tablica));
//
//        int nieposortowanaTablica[] = new int []{1,3,3,2,4,1};
//        System.out.println(Arrays.toString(nieposortowanaTablica));
//        Arrays.sort(nieposortowanaTablica);
//        System.out.println(Arrays.toString(nieposortowanaTablica));
//
//        Arrays.sort(nieposortowanaTablica);
//        System.out.println(nieposortowanaTablica[0]);
//        int ostatnia = nieposortowanaTablica.length-1;
//        System.out.println(nieposortowanaTablica[ostatnia]);
//
//// przy użyciu utils by nie zmieniać tablicy
//        System.out.println(Arrays.toString(nieposortowanaTablica));
//        System.out.println(NumberUtils.max(nieposortowanaTablica));
//        System.out.println(Arrays.toString(nieposortowanaTablica));

        // moje jeszcze nie dziala
//        int nowaTablica [] = new int []{1,2,3,4,-5,-2,-3,9};
//        for (int i = 0; i < nowaTablica.length; i++) {
//            if (nowaTablica[i] < 0) {
//
//            }
//        }
//        int tablicaZUjemnymi [] = new int []();


    }
    public static int [] policzUjemne(int[] tablica){
        int [] tab = new int[0];
        for (int elementTablicy : tablica){
            if ( elementTablicy < 0 ){
                tab = ArrayUtils.add(tab,elementTablicy);
            }
        } return tab;
    }



//    public static void zamienPierwsztITrzeciElement(int [] tablica){
//        int zmienna = tablica[0];
//        tablica[0] = tablica[2];
//        tablica[2] = zmienna;
//    }
}
