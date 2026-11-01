public class MethodOverriding {
    public static void main(String[] args){
        teacher teachers = new teacher();
        students studenty = new students();

        teachers.get();
        studenty.get();

    }
}
class teacher{

    void get(){
        System.out.println("You are not allow to the class");
    }
}
class students extends teacher{

    //we simply use the get method and change the expected output in it thats
    //called method overriding
    @Override
    void get(){
        System.out.println("you are wright sir ");
    }
}
