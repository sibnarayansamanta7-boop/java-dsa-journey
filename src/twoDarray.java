public class twoDarray {
    public static void main(String[] args){
        //2D array = An array where each element is an array
        //Useful for storing a matrix of data
        String[][] fruits = {{"mango","Bananna","apple"},
                             {"carrot","tomato","chili"},
                             {"orange","guava","lichi"}};

        for (String[] fruit : fruits) {
            for (String frui : fruit){
                System.out.print(frui + " ");
            }
            System.out.println(" ");
        }
        

       int[][] number = {{1,2,3,4},
                         {5,6,7,8},
                         {9,0,1,2}};
       //thats how you add or update a element
       number[0][3] = 6;
        for (int[] numb : number) {
            for (int num : numb) {
                System.out.print(num + " ");
            }

            System.out.println(" ");
        }
    }
}
