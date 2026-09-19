public class Overloading {
    public static void main(String[] args){
        //concept of method overloading
        System.out.println(add(1,3,6));
    }
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
