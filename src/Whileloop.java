import java.util.Locale;
import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        String response = "";
        while (!response.equals("Q")){
            System.out.println("You are playing a game ");
            System.out.print("Press Q to quit: ");
            response = sn.next().toUpperCase();
        }
        System.out.println("You have quit the game");


        sn.close();
    }
}
