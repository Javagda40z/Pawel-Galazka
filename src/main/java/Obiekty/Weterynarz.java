package Obiekty;

public class Weterynarz {

    public void sayHello(Cat cat){
        System.out.println("Witaj" + cat.getImię());

    }

    public void sayHello(Dog dog){
        System.out.println("Witaj" + dog.getImię());

    }

    public static void main(String[] args) {
        Cat kot = new Cat("Filemon");
        Dog pies = new Dog("Burek:");
        Weterynarz weterynarz = new Weterynarz();
        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);


    }
}
