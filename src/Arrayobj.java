class car{
String name;
String colour;
int milage;

    car (String name, String colour,int milage){{
        this.name=name;
        this.colour=colour;
        this.milage=milage;
    }
    }
    void get() {
    System.out.println("This is my car " + this.name + " Colour is "+ this.colour) ;
}
}

public class Arrayobj {
    public static void main(String[] args){
       // car cars = new car("BMW","Black",100);

      car[] cars = {new car("BMW","Black",100),new car("LAMBOGINI","RED",80)};

      for (car Car : cars){

         Car.get();
      }
    }
}



