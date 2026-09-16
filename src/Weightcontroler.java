import java.util.Scanner;
public class Weightcontroler {
    public static void main(String[] args){
        //weight convertion program
        Scanner anything = new Scanner(System.in);
        System.out.println("We give you two options");
        System.out.println("1 we convert lb to kg");
        System.out.println("2 we convert kg to lbs");

        double weight;
        double neweight;
        int choice;

        System.out.print("Enter your choice");
        choice = anything.nextInt();
        System.out.print(choice);

        if (choice == 1){
            System.out.print("Enter the value in lb");
            weight = anything.nextDouble();
            neweight = weight * 0.4535924;
            System.out.print(neweight);
        } else {
            System.out.print("Enter the value in kg");
            weight = anything.nextDouble();
            neweight = weight * 2.204623;
            System.out.print(neweight);
        }
        anything.close();
        // option 1 convert lbs to kgs
    }
}
