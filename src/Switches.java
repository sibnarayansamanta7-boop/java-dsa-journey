import java.util.Scanner;

public class Switches {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your day");
        String Day = sn.nextLine();

        switch (Day){
            case "Monday","Tuesday","Wednesday","Thusday","Friday" -> System.out.println("This is a weakday boaring😭");
            case "saturday" -> System.out.println("this is good day🤣");
            case "sunday" -> System.out.println("this is good day🤣");
        }
    }

}
