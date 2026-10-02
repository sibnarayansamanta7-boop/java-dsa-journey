import java.util.Scanner;

public class Quizgame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Java quiz game

        String[] question = {
                "Which planet in the Milky Way is the hottest?",
                "What is the world’s largest retailer as of 2026?",
                "Who discovered that the Earth revolves around the sun?",
                "Which ocean is the largest by surface area?",
                "What is the chemical symbol for water?"
        };

        String[][] answer = {
                {"A. Mars", "B. Jupiter", "C. Venus", "D. Mercury"},
                {"A. Amazon", "B. Walmart", "C. Costco", "D. Target"},
                {"A. Isaac Newton", "B. Galileo Galilei", "C. Nicolaus Copernicus", "D. Albert Einstein"},
                {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"},
                {"A. H2O2", "B. H2O", "C. OH2", "D. HO2"}
        };

        int[] input = {3, 2, 2, 4, 2};

        int score = 0;
        int guess;

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("******************************");

        for (int i = 0; i < question.length; i++) {

            System.out.println();
            System.out.println(question[i]);

            for (String option : answer[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == input[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("********");
            }
        }

        System.out.println();
        System.out.println("Your final score is: " + score +
                " out of " + question.length);

        sc.close();
    }
}