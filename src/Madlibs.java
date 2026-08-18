import java.util.Scanner;

public class Madlibs {

    public static void main (String[] args){
        Scanner util = new Scanner(System.in);

        String anything;
        String name;
        String anything2;
        String anything3;



        System.out.print("I am a student of ");
        anything = util.nextLine();
        System.out.print("My name is ");
        name = util.nextLine();
        System.out.print("Now i am in ");
        anything2 = util.nextLine();
        System.out.print("My next terget  ");
        anything3 = util.nextLine();


        System.out.println("I am a student of " + anything);
        System.out.println("My name is " + name);
        System.out.println("Now i am in " + anything2);
        System.out.println("My next terget " + anything3 +" " +anything);

        util.close();
    }
}
