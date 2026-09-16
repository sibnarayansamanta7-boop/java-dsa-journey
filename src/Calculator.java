import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        double a;
       double b;
       char operator;
        double c = 0;

        System.out.print("Enter the first num a ");
        a = sn.nextDouble();
        System.out.print("Enter an operator ");
        operator = sn.next().charAt(0);

        System.out.print("Enter second num ");
        b = sn.nextDouble();

        switch (operator){
            case '+' -> c = a + b ;
            case '-' -> c = a - b;
            case '/' -> c = a / b;
            case '*' -> c = a * b;
        }
        System.out.println(c);
                sn.close();
    }
}
