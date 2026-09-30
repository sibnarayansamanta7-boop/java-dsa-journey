public class VariableArguments {
        static void add(int... numbers){
            int sum = 0;
            //for this this thing is enhanced for loop it takes variable once at a time
            for (int number : numbers) {
                sum = sum + number;
                System.out.println(number);
        }
            System.out.println("Sum = " + sum);
    }
    public static void main(String[] args){
            add(10, 20,30);

    }
}
