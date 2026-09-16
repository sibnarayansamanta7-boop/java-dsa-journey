import java.util.Scanner;

public class Logicalop {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        //there are three types of Logicaloperators
        // && = AND
        // || = OR
        // ! = NOT
       /*  int age;
        System.out.print("Enter your age ");
        age = sn.nextInt();

        if (age >= 60 && age <= 100){
            System.out.println("You are too old to play👨🏻‍🦳" );
        }else {
            System.out.println("You are selected to play 👦");
        }
       */

        String username;
        System.out.print("Enter you name");
        username = sn.nextLine();

        if (username.length() <4 || username.length() >12 ) {
            System.out.println("Your name is " + username);
        } else {
            System.out.println("You are not applicable in hear ");
        }

        sn.close();
    }
}
