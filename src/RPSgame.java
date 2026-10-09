import java.util.Random;
import java.util.Scanner;

public class RPSgame {
    public static void main(String[] args){

        // Rock paper scissors game
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        String[] game = {"Rock","Paper","scissor"};


        String playerchoice;
        String computerchoice;
        String playagain = "yes";
        System.out.println("Enter your choice");
        playerchoice = sc.nextLine();

do {


    if (!playerchoice.equals("Rock") && !playerchoice.equals("Paper") && !playerchoice.equals("scissor")) {
        System.out.println("Invalid choice");
        continue;
    }
    computerchoice = game[rn.nextInt(3)];
    System.out.println("Computer choice " + computerchoice);

    if (playerchoice.equals(computerchoice)) {
        System.out.println("It is tie!");

    } else if ((playerchoice.equals("Rock") && computerchoice.equals("scissor")) ||
            (playerchoice.equals("Paper") && computerchoice.equals("Rock")) ||
            (playerchoice.equals("scissor") && computerchoice.equals("Paper"))) {
        System.out.println("You win!");

    } else {
        System.out.println("You lose !");
    }
    System.out.println("Play again (yes/no) :");
playagain = sc.nextLine();

} while (playagain.equals("yes"));


sc.close();
    }
}
//else if (playerchoice.equals("Paper") && computerchoice.equals("Rock")) {
//            System.out.println("You win !");
//        } else if (playerchoice.equals("scissor") && computerchoice.equals("Paper")) {
//            System.out.println("You win !");
//        }