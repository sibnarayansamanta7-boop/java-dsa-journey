class Student{
    String name;

    //Static variable ar khetre output
    // main function ar age student ar modheai lekha jai
    static String batch = "CSE";

    Student(String name){
        this.name=name;
    }
   void get(){
       System.out.println("The name of the student is " + name +" Depertment is " + batch);
   }
}

public class Static {

    public static void main(String[] args){

        Student student = new Student("Sibu" );
        Student student1 = new Student("Rahul" );

        student.get();
        student1.get();

    }
}