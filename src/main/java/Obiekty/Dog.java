package Obiekty;

public class Dog implements Animal {

    private String imię;

    public Dog(String imię) {
        this.imię = imię;
    }

    public String getImię() {
        return imię;
    }
    public Dog (){

    }

    public void aportu (){
//pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("Hau Hau!");
    }

    @Override
    public void move() {
        System.out.println("Pum pum");

    }
}
