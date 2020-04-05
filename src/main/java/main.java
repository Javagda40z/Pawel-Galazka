public class main {

    public static void main(String[] args){
        System.out.println("Hell world");
        System.out.println(dodaj(5,5));
        System.out.println(odejmij(5,5));
        System.out.println(podziel(5,5));
        System.out.println(pomnoz(5,5));

        System.out.println(czyParzysta(5));


    }

    public static boolean czyParzysta(int a){
        return a % 2 == 0;
    }

    public static int dodaj(int a, int b){
        return a+b;
    }
    public static int odejmij(int a, int b){
        return a-b;
    }
    public static double podziel(int a, int b){
        return ((double) a)/b;
    }
    public static int pomnoz(int a, int b){
        return a*b;
    }
}
