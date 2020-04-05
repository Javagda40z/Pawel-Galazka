package Obiekty2;

import Obiekty.Movable;

public abstract class Animal2 implements Movable{

    private String imię;

    public String getImię() {
        return imię;
    }

    public Animal2(String imię) {
        this.imię = imię;
    }

    abstract void makeSound();
}
