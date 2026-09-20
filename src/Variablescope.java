public class Variablescope {
    static int a = 3; //This is class variable
    public static void main(String[] args){
        int a =2; //This is local variable
        System.out.println(a);
        add();
    }
    static void add(){
        int a = 1; //This is local variable
        System.out.println(a);
    }
}
//java  use local variable if it present or if not
//then use class variable