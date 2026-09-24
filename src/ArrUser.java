import java.util.Scanner;

public class ArrUser  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books;
        int length;

        System.out.println("Enter the number of elements you want in array:");
        length = sc.nextInt();

        // Consume the leftover Enter
        sc.nextLine();

        books = new String[length];

        // Take book names
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter book " + (i + 1) + ":");
            books[i] = sc.nextLine();
        }

        // Print books
        System.out.println("Your books are:");

        for (String book : books) {
            System.out.println(book);
        }
      //make sure close this
        sc.close();
    }
}
