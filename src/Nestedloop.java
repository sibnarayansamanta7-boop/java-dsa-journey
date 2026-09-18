import java.util.Scanner;

public class Nestedloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int row;
        int column;
        char symbol;

        System.out.print("Enter the number of rows ");
        row = sc.nextInt();

        System.out.print("Enter the number of column ");
        column = sc.nextInt();
        System.out.print("Enter your symbol ");
        symbol = sc.next().charAt(0);

        for (int i = 0; i<row ; i++){
            for (int j=0 ; j<column ; j++){
                System.out.print(symbol + "");
            }
            System.out.println();
        }
    }
}
