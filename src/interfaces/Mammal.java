package interfaces;

abstract public class Mammal extends Animal implements Flyable{

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Yarasa " + name + " uçuyor");

    }

    @Override
    public void land() {
        System.out.println("Yarasa " + name + " konuyor");

    }
}
