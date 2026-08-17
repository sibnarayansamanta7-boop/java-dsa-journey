

//scanner is a java class that allows program to read input
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {

//Create a Scanner → connect it to the keyboard → store it in a variable called scanner
         Scanner acc = new Scanner(System.in);

         System.out.print("Enter your name: ");
         String name = acc.nextLine();

         System.out.print("Tell us whats my age is: ");
         int age = acc.nextInt();

         System.out.print("Enter your gpa :");
         double gpa = acc.nextDouble();

        //upper line says that "Scanner, please read the next line the user enters."
         System.out.println("Your name is : " + name);
         System.out.println("Your age is :"+ age);
         System.out.println("The gpa is :" + gpa);

         acc.close();

    }
}
