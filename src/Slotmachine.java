import java.util.Random;
import java.util.Scanner;

public class Slotmachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        while (balance > 0) {

            System.out.println("\nCurrent balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            // Check bet
            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS!");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0!");
                continue;
            }

            // Remove bet from balance
            balance -= bet;

            // Spin the slot machine
            System.out.println("\nSpinning...");
            row = spinRow();

            // Display result
            printRow(row);

            // Calculate payout
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("Sorry, you lost this round.");
            }

            // Ask if player wants to continue
            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("\nGAME OVER!");
        System.out.println("Your final balance is $" + balance);

        scanner.close();
    }

    // Generate random slot symbols
    static String[] spinRow() {

        String[] symbols = {
                "🍒",
                "🍉",
                "🍋",
                "🔔",
                "⭐"
        };

        String[] row = new String[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // Print the slot machine row
    static void printRow(String[] row) {

        System.out.println("********************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("********************");
    }

    // Calculate winnings
    static int getPayout(String[] row, int bet) {

        // Three symbols are the same
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {

            return switch (row[0]) {

                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;

                default -> 0;
            };
        }

        // First two symbols are the same
        else if (row[0].equals(row[1])) {

            return switch (row[0]) {

                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;

                default -> 0;
            };
        }

        // Last two symbols are the same
        else if (row[1].equals(row[2])) {

            return switch (row[1]) {

                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;

                default -> 0;
            };
        }

        // No matching symbols
        return 0;
    }
}