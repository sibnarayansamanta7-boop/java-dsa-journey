import java.util.Scanner;

public class CelcioustoF {
    public static void main(String[] args) {
        Scanner anything = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the tem : ");
        temp = anything.nextDouble();

        System.out.print("Convert to cel to fer? ");
        unit = anything.next().toUpperCase();

        newTemp = (unit.equals("c")) ? (temp - 32) * 5/9 : (temp * 9 / 5) + 32;
        System.out.println(newTemp);
        anything.close();
    }
}
