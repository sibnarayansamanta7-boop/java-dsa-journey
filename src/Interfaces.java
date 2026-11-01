interface Animal{

    void sound();
}
 class dogs implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog sound is wowowow ");
    }
}

class cats implements Animal{
    @Override
    public void sound(){
        System.out.println("Cat sound is maumau");
    }
}



public class Interfaces {
    public static void main(String[] args){

        //Interfaces = A bluprint of a class that specifies a set of abstrac methods
        dogs dogy = new dogs();
        cats caty = new cats();

        dogy.sound();
        caty.sound();
    }
}
