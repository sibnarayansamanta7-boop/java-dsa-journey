import java.util.Scanner;

public class Ifelse {
    public static void main (String[] args){
       Scanner marks = new Scanner(System.in);
       double gpa;
        gpa = marks.nextDouble();

        if(gpa >= 9) {
            System.out.println("I wana eat a 1000 meal");
        } else if (gpa >= 8.4) {
        System.out.println("I dont eat any without mess food for 4 days");

        } else if ( gpa <7.8) {
            System.out.println("I focused in my DSA ");
        } else {
            System.out.println("I dont west any money in food i just eat monthly mess food for next month");
        }
        marks.close();
    }

}
