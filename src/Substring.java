import java.util.Scanner;
public class Substring {
public static void main(String[] args){
    Scanner anything = new Scanner(System.in);

    String email;
   String username;
   String domain;

   email = anything.nextLine();
    username = email.substring(0, 6);
    domain = email.substring(email.indexOf("@"));

    System.out.println(username);
    System.out.print(domain);
}
}
