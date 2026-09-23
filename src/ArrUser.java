import java.util.Scanner;

public class ArrUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] books ;
        int length;

        System.out.println("Enter the number of of element you want in array ");
        length = sc.nextInt();
        books = new String[length];

        for (int i = 0; i>books.length; i++){
            System.out.println("Enter one by one ");
            books[i] = sc.nextLine();
        }
        for (String book : books){
            System.out.println(books);
        }
        sc.close();
    }
}
