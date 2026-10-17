public class Super {

    public static void main(String[] args) {

        student Student = new student("Sibu", "Samanta");

        name Name = new name("Rupa", "Samanta", 5.6);

        System.out.println(Student.first + " " + Student.last);

        System.out.println(Name.first + " " + Name.last);
        System.out.println("GPA: " + Name.gpa);
    }
}

class student {

    String first;
    String last;

    student(String first, String last) {
        this.first = first;
        this.last = last;
    }
}

class name extends student {

    double gpa;

    name(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }
}