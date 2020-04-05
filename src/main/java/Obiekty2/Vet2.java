package Obiekty2;


public class Vet2 {
    public void sayHello(Animal2 zwierzę){
        System.out.println("Witaj " + zwierzę.getImię());

    }

    public static void main(String[] args) {
        Animal2 kot = new Cat2("Filemon");
        Animal2 pies = new Dog2("Burek");

        Vet2 weterynarz = new Vet2();
        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);

        Animal2 chomik = new Hamster("Bulbazaur");
        weterynarz.sayHello(chomik);

    }
}
