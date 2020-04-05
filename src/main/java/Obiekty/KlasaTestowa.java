package Obiekty;

import java.util.ArrayList;
import java.util.List;

public class KlasaTestowa {

    public static void main(String[] args) {

        Animal zwierzęta[] = new Animal[5];
        List<Animal> listaZwierząt = new ArrayList<>();

        zwierzęta[0] = new Cat();
        zwierzęta[1] = new Cat();
        zwierzęta[2] = new Cow();
        zwierzęta[3] = new Dog();
        zwierzęta[4] = new Dog();

        listaZwierząt.add(new Dog());
        listaZwierząt.add(new Dog());
        listaZwierząt.add(new Cow());
        listaZwierząt.add(new Cow());
        listaZwierząt.add(new Cat());
        listaZwierząt.add(new Cat());

        dajGłosDlaTablicyZwierząt(zwierzęta);
        dajGłosDlaListyZwierząt(listaZwierząt);

    }

    public static void dajGłosDlaTablicyZwierząt(Animal zwierzęta[]) {
        for (Animal animal : zwierzęta) {
            animal.makeSound();
        }
    }

    public static void dajGłosDlaListyZwierząt(List<Animal> zwierzęta) {
        for (Animal animal : zwierzęta) {
            animal.makeSound();
        }
    }
}