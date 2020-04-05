package Obiekty2;

public class Hamster extends Animal2 {

    public Hamster(String imię) {
        super(imię);
    }

    @Override
    void makeSound() {
        System.out.println("Har har har");
    }

    @Override
    public void move() {
        System.out.println("Bieg bieg");

    }
}
