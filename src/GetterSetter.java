public class GetterSetter {

    public static void main(String[] args){
    Sibu sib = new Sibu("Sibnarayan","CSE",190);
        sib.setName("Khepy");
        System.out.println("My name is " + sib.getName() + " My batch is " + sib.getBatch() +" My roll no is " + sib.getroll());

    }
}
class Sibu{
    private String name;
    private String batch;
    private int roll;



    public Sibu(String name, String batch, int roll){
        this.name=name;
        this.batch=batch;
        this.roll=roll;
    }

    String getName(){
        return this.name;
    }

    String getBatch(){
        return this.batch;
    }

    int getroll(){
        return this.roll;
    }

    void setName(String name){
        this.name=name;
    }


}
