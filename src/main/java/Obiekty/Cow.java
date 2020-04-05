package Obiekty;

public class Cow implements Animal{

    public void muczy(){
//        daje mleko
    }

    @Override
    public void makeSound() {
        System.out.println("Muu Muu");
    }

    @Override
    public void move() {
        System.out.println("Klap klap");

    }
}
