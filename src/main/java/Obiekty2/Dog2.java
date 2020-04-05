package Obiekty2;

public class Dog2 extends Animal2 {

    public Dog2(String imię) {
        super(imię);
    }

    @Override
    void makeSound() {
        System.out.println("Hau hau");

    }

    @Override
    public void move() {
        System.out.println("Pum pum");

    }
}
