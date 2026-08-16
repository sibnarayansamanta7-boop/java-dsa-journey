public class Variable {

    public static void main(String[] args) {
        //variable = a reusable container for a value
        // a variable behaves as if it was the value it contains

        /* two types of variables 1> primitive= simple value
        stored directly in memory ( int, double, char, boolean)
         2> reference = memory address stack that point to the heap
         (String, array, abject)  */

        //thats all are primitive

        int number = 2;
        int marks = 1;

        double gpa = 7.5;

        char currency = '$';

        boolean isStudent = true;
        boolean myName = false;

        System.out.println("The number is "+ gpa + " crrency give me in this number is " + currency+marks );
        //thats all are reference

        String name = "Sibnarayan Samanta";
        System.out.println("My name is " + name);

      if (myName) {
          System.out.print("I dont what to write");
      }
      else {
          System.out.print("Yes i dont know anything");
      }
    }

}
