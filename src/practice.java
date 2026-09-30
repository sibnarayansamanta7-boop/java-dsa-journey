import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] fruits = {"apple","bannana","mango","lemon"};
        boolean istrue = false;
        String target;

        System.out.println("Enter the elememt you want the position ");
target = sc.nextLine();
        for (int i = 0 ; i<fruits.length; i++){
            if (fruits[i].equals(target)){
                System.out.println("The element is in  " + i);
istrue = true;
break;

            }
        }
        if (!istrue){
            System.out.println("Please enter a valid element");
        }
        sc.close();
    }
}
