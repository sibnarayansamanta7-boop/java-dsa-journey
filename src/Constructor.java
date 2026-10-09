public class Constructor {
    public static void main(String[] args){


        StuConstructor student1 = new StuConstructor("Sibu",21,7.4,"Nice and Good");
        StuConstructor student2 = new StuConstructor("rohit", 29,7.8,"Not that much");
        StuConstructor student3 = new StuConstructor("sneha",20,8.8,"medium");

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.pertionality);


        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.pertionality);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.pertionality);
    }
}

