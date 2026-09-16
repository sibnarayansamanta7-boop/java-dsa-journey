public class ternaryop {
    public static void main(String[] args){

        int age = 21 ;
        int mask = 60;
        String passorfaill = (mask>=60) ? "pass" :"Faill";

        String oldoryoung = (age % 2 == 0) ? "Old" : "Young";
        System.out.println(passorfaill);


    }
}
