package Obiekty;

public class Cat implements Animal {

    private static int licznikKotów = 0;
    private int licznik = 0;
    private String imię;

    public Cat (String imię) {
        this.imię = imię;
    }

    public String getImię() {
        return imię;
    }
    public Cat (){
        this("Filemon");
        licznikKotów++;
    }

    public void drap (){
//kot drapie
    }

    public void eatMouse(){
        licznik++;
        System.out.println("Zjadełm " + licznik + " myszy");
    }

    @Override
    public void makeSound() {
        System.out.println("Miauu!");
    }

    @Override
    public void move() {
        System.out.println("Cicho.. cicho");

    }
}
