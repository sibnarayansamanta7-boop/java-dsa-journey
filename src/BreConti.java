public class BreConti {
    //break = break out of a loop (STOP)
    //continue = skip current iteration of a loop (skip)
    public static void main(String[] args){

        for (int i = 1; i < 10; i++){
            if (i==4){
                break;
            }
            System.out.print(i + "");
        }

        for (int i = 1; i < 10; i++){
            if (i==6){
                continue;
            }
            System.out.println(i + "");
        }

    }
}
