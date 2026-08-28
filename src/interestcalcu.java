// A = p[1 +r/n]^nt
import java.util.Scanner;
public class interestcalcu {
public static void main(String[] args){
    Scanner anything = new Scanner(System.in);

    double A; //Final future amount
    double P; //principal amount
    double r; //Annual interest rate
    double n; //Number of times the interest compounds per year
    double t; //Time the money is invested
//how to use math


    System.out.print("principal amount P is ");
    P = anything.nextDouble();
    System.out.print("Annual interest rate is ");
    r = anything.nextDouble() / 100;
    System.out.print("Number of times the interest compounds per year n is ");
    n = anything.nextDouble();
    System.out.print("Time the money is invested t is ");
    t = anything.nextDouble();

    A = P*Math.pow(1+r/n,n*t);
    System.out.print("Final future amount A is " + A);
}
}
