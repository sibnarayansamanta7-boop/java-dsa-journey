import java.util.Scanner;

public class Areacalculate {
    public static void main (String[] args) {
        Scanner get = new Scanner (System.in);

        double width = 0;
        double hight = 0;
        double area = 0;

        System.out.print("The writh is :");
        width = get.nextDouble();

        System.out.print("The hight is :");
        hight = get.nextDouble();

        area = width * hight;

        System.out.print("The area is " + area  );

        get.close();
    }
}
