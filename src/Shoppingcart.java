
import java.util.Scanner;

public class Shoppingcart {
    public static void main (String[] args){
        Scanner anythiing = new Scanner(System.in);

        double price ;
        int count ;
        String name;
        double bill;

        System.out.print("What you want to bye :");
        name = anythiing.nextLine();

        System.out.print("How many you want to order: ");
        count = anythiing.nextInt();

        System.out.print("The expected price of that :");
        price = anythiing.nextDouble();

        bill = price * count;

        System.out.println("You orderd " +count + "no of " + name);
        System.out.println("The final bill is " + bill);

        anythiing.close();
    }
}
