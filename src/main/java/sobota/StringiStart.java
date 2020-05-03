package sobota;

import javax.naming.ldap.ExtendedRequest;
import java.util.ArrayList;
import java.util.List;

public class StringiStart {

    public static void main(String[] args) {

//        String zmienna1 = "tekst";
//        String zmienna2 = new String("tekst");
//        String zmienna3 = "tekst";
//
//        System.out.println(zmienna1==zmienna2);
//        System.out.println(zmienna1==zmienna3);

        Człowiek człowiek1 = new Człowiek("Matuesz",99);
        Człowiek człowiek2 = new Człowiek("Matuesz",99);
        Człowiek człowiek3 = new Człowiek("X",99);

//        System.out.println(człowiek1==człowiek2);
//        System.out.println(człowiek1==człowiek3);
//        System.out.println(człowiek1.equals(człowiek2));

        Człowiek człowiek4 = new SuperCzłowiek("SuperMateusz", 100);
        Człowiek człowiek5 = new ExtraCzłowiek("SuperMateusz", 100);

        List<Człowiek> ListaCzłowieków = new ArrayList<>();
        ListaCzłowieków.add(człowiek3);
        ListaCzłowieków.add(człowiek4);
        ListaCzłowieków.add(człowiek5);

        System.out.println(człowiek4.equals(człowiek5));
        test(ListaCzłowieków);


    }

    public static void test(List<Człowiek> człowieki){

        Człowiek człowiek = człowieki.get(0);
        Człowiek człowiek1= człowieki.get(1);

        człowiek.equals(człowiek1);

    }
}
