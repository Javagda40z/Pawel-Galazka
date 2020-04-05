package Application;

public class main {

    public static void main(String[] args) {

// ctrl + alt + v  ->>> szybki string
//        String napis = " Jestem na dobrej drodze do zostania profesjonalnym programistą Java";

//        for (int i = 0; i < napis.length(); i++){
//            System.out.print(napis.charAt(i));
//        }
//
//        for (int i = 0; i < napis.length(); i = i +2){
//            System.out.print(napis.charAt(i));
//        }
//
//        for (int i = napis.length() - 1; 1 >= 0; i--) {
//            System.out.print(napis.charAt(i));
//        }

//        while (true) {
//            System.out.println(napis);
//        }

//        for (int i = 0; i <= 100; i++);{
//
//            System.out.println(i);
//        }
//        for (int i = 100; i >= 0; i--);{
//
//            System.out.println(i);
//        }
//
//        int i = 0;
//        while (i<=100)
//        { System.out.println(i); i++; }

        dodawanie(2,2,0);
    }

    public static void dodawanie(int a, int b, int c){

        int suma = 0;
        while (suma<c){
            suma = suma + (a + b);
            System.out.println(suma);
        }
    }

}
