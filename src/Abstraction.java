abstract class Animals {

    // Abstract method (no body)
    abstract void sound();

    // Normal method (has a body)
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animals {

    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}