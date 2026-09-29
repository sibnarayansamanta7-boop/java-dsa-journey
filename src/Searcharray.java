import java.util.Scanner;

public class Searcharray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 4 , 9 ,7 , 6};
        boolean isFound = false;
        int target;


        System.out.println("Enter a number found for ");
        target = sc.nextInt();


        for (int i = 0; i <numbers.length ; i++){
            if (numbers[i] == target) {
                System.out.println("The element is in" + i);
                isFound = true;
                break;
            }
        }
        if (!isFound ){
            System.out.println("Please enter the valid number");
        }
        sc.close();
    }
}
