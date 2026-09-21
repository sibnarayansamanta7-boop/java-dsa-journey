import java.util.Random;
import java.util.Scanner;

public class Diceroller {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int numofDice;
        int total = 0;

        System.out.print("Enter the no of roll ");
        numofDice = sc.nextInt();

        if (numofDice > 0){
            for (int i = 0; i <numofDice; i++ ){

                int roll = rn.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total " + total);

        }else {
            System.out.println("# dice must be getter than zero");
        }


       sc.close();
    }
    static void printDie(int roll){
        String dice1 = """
                -------
              |         | 
              |    *    | 
              |         |
                ------- 
                """;

        String dice2 = """
                -------
              |    *    | 
              |         | 
              |    *    |
                ------- 
                """;

        String dice3 = """
                -------
              |*       | 
              |    *    | 
              |       * |
                ------- 
                """;

        String dice4 = """
                -------
              | *    *  | 
              |         | 
              | *     * |
                ------- 
                """;

        String dice5 = """
                -------
              | *    *  | 
              |    *    | 
              | *     * |
                ------- 
                """;

        String dice6 = """
                -------
              | *  *    *  | 
              | *  *    *  | 
              | *  *    *  | 
                ------- 
                """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invaliod roll");
        }

    }
}
