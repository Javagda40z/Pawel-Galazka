package Obiekty2;

public class Cat2 extends Animal2 {

    public Cat2(String imię) {
        super(imię);
    }

    @Override
    void makeSound() {
        System.out.println("MIauuu");

    }

    @Override
    public void move() {
        System.out.println("UWAGA! KOT IDZIE!!");

    }
}
