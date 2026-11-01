import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        int num;
        System.out.print("How many food You want to write (1-10) " );

        num = sc.nextInt();
        sc.nextLine();


        for (int i = 1; i <= num; i++) {
            System.out.print("Enter food " + i + " : ");
            String ars = sc.nextLine();
            ar.add(ars);

        }
        System.out.print(ar);

        sc.close();
    }
}
