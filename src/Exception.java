import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print(" Enter a number ");
            int num = sc.nextInt();
            System.out.println(num);
        }catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
        }

        catch (java.lang.Exception e){
            System.out.println("Please enter a valid number ");
        }
        finally {
            sc.close();
            System.out.println("Finally code is exicuted ");
        }
    }
}
