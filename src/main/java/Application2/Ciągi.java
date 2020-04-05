package Application2;

import java.util.ArrayList;
import java.util.List;

public class Ciągi {

    public static void main(String[] args) {
//        stworzCiągArytmetyczny().add(c)
        System.out.println(stworzCiągArytmetyczny(5,1,3));
    }

    public static List<Integer> stworzCiągArytmetyczny (int długość, int pierwszy, int różnica) {
        List <Integer> ciąg = new ArrayList<>();
        ciąg.add(pierwszy);
        for (int i = pierwszy; i < długość; i++){
            ciąg.add(pierwszy + i * różnica);
        } return ciąg;
    }
}
