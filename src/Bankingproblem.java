import java.util.Scanner;

public class Bankingproblem {
   static Scanner sn = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Check your account ");
        double balance = 6;
        boolean isRunning = true;
        int choice;
        System.out.println("1. Check your bank balance");
        System.out.println("2. Check your deposite balance");
        System.out.println("3. Withdraw amount");
        System.out.println("4. Exit ");

        System.out.println("Enter your choice (1-4) ");
        choice = sn.nextInt();

        switch (choice){
            case 1 -> showBalance( balance);
            case 2 ->{
                balance = balance + deposite();
                showBalance(balance);
            }
            case 3 -> {
                balance = balance - withdraw(balance);
                showBalance(balance);
            }
            case 4 -> {
                exit();
                isRunning = false;
            }
            default -> System.out.println("Invalid choice");
        }

    }
    static void showBalance(double balance){
        System.out.printf("$%.2f\n" , balance);
    }
    static double deposite(){
        double deposite;
        System.out.print("Enter the amount to deposite ");
        deposite = sn.nextDouble();

        if (deposite<0){
            System.out.println("balance is not be negative");
            return 0;
        }
        System.out.println(deposite);
        return deposite;
    }
    static double withdraw(double balance){
        int amount;
        System.out.print("Enter withdrawl amount ");
        amount = sn.nextInt();

        if (amount<0){
            System.out.println("No negative number allowed");
            return 0;
        }
        if (amount >balance){
            System.out.println("Insufficient balance");
            return 0;
        }
        System.out.println(amount);
      return amount;
    }

    static void exit(){
        System.out.println("you are succesfully exit from server ");
    }
}
