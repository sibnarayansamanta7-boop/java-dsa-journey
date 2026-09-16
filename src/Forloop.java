import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            //this is for slowing next output
            Thread.sleep(1000);
        }

        System.out.println("Enter any number ");
        int max = sc.nextInt();

        for (int i = 0;i<=max;i++){

            System.out.println(i);
        }
        sc.close();
    }
}
