import java.sql.SQLOutput;

public class Printfstatement {
    public static void main(String[] args){
        String name = "Sibnarayan";
        char first = 's';
        int age = 21;
        double Sgpa = 8.5;
        boolean isStudent = true;

        System.out.printf("My name is %s \n", name);
        System.out.printf("My names first char %c \n",first);
        System.out.printf("My age is %d \n", age);
        System.out.printf("My Sgpa is %f \n", Sgpa );
        System.out.printf("Am i a student %b \n", isStudent);

        //(+ = output a plus)  (, = comma grouping separator)
        //( (= negetive number a () , space for give a space
        // 0 = zero padding
        // .1 means it get only one number after .

        double num1 = 9.0800;
        double num2 = 10.08;
        double num3 = -11.08;

        System.out.printf("The number is %.1f\n",num1);
        System.out.printf("The number is %+f\n",num2);
        System.out.printf("The number is %(f\n",num3);
    }
}
