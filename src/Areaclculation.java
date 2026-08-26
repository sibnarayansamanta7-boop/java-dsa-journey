import java.util.Scanner;

public class Areaclculation {
    public static void main(String[] args){

        Scanner anything = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("Enter the length ");
        a = anything.nextDouble();
        System.out.println("The leangth is " + a);

        b = anything.nextDouble();
        System.out.println("The leangth is " + b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        System.out.println(c);

    }

}
