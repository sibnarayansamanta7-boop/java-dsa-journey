public class Methods {
    public static void main(String[] args){
       double number = 3.4;
        int age = 22;
        String name = "Sibu";
       happybirthday(name,age);

        System.out.println(square(3));
    }
    static void happybirthday(String name,int age){
        System.out.println("Hi there wish you a happy birthday " + name);
        System.out.println("Wish you have a great day");
        System.out.println("Love you so much");
        System.out.printf("You are now %d years old! \n ", age);
    }

     static double square(double number){
        return number * number * number;
    }
}
