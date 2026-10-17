public class Inheritence {
    public static void main(String[] args) {
    dog dogs = new dog();
    cat cats = new cat();

    dogs.beark();
    dogs.get();
    cats.get();
    }
}
class grandparent {
    boolean isAlive;

    void get(){
        System.out.println("This is an animal");
    }
}
class dog extends grandparent{

    void beark(){
        System.out.println("Dog is bearking");
    }
}

class cat extends grandparent{

}
