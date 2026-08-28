public class Nastedif {
    public static void main(String[] args){

        boolean Student = false;
        boolean hotgirl = false;
        double price = 100;

        if (Student){
            if (hotgirl){
                System.out.println("For student you get 10% discount");
                System.out.println("For hotgirl you get 20% discount");
                price = price * 0.7;
            } else {
                System.out.println("For student you get 10% discount");
                price = price * 0.9;

            }

        } else {
           if (hotgirl){
               System.out.println("For hotgirl you get 20% discount");
               price = price * 0.8;

           }else {
               price = price * 1;

           }

        }
        System.out.println("The price of tickit is" + price);

    }
}
