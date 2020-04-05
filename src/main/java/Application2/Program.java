package Application2;

public class Program {
    public static void main(String[] args) {
//        Program program = new Program();
//        program.tabliczkamnożenia(5);
        TabliczkaMnożenia tabliczkaMnożenia = new TabliczkaMnożenia(5);
        System.out.println(tabliczkaMnożenia.getLiczba());
    }

    public void tabliczkamnożenia(int liczba){

        System.out.println("Tabliczka mnożenia dla liczby" + liczba);
        for (int i = 1; i <=liczba; i++){
            System.out.println(liczba + " x "  + i + " = " + liczba * i );
        }
    }

    public static int sumaLiczb(int x,int y){

        int suma = 0;
        for (int i = x; i <= y; i++){
            suma = suma + i;
            }
        return suma;
    }


}
