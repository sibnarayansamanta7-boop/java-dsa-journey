public class StuConstructor {

    String name;
    int age;
    double gpa;
    String pertionality;

    StuConstructor(){
        this.name = "Gest";
        this.age = 000;
        this.pertionality = "Not valid";
    }

    StuConstructor(String name, int age,double gpa,String pertionality){
       this.name = name;
       this.age = age;
       this.gpa = gpa;
       this.pertionality = pertionality;

    }
}
