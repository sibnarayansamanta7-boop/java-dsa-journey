
import java.util.Random;

public class Random1 {

    public static void main (String[] args){

        Random anything = new Random();
     int Random1;
        int Random2;
        int Random3;

        Random1 = anything.nextInt(1, 6);
        Random2 = anything.nextInt(40, 90);
        Random3 = anything.nextInt(100, 600);

     System.out.println(Random1);
        System.out.println(Random2);
        System.out.println(Random3);

        double randomly;
        randomly = anything.nextDouble(1.2, 9.0);

        if (randomly>3.0){
            System.out.println("Head");
        } else {
            System.out.println("Tails");
        }

    }
}
