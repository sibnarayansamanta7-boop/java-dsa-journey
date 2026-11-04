import java.io.FileWriter;
import java.io.IOException;


public class Filewrites {
    public static  void main(String[] args) throws IOException {

        String filePath = "text.text";



        try( FileWriter write = new FileWriter(filePath)) {
            write.write("I like Biriyani");
        }catch (IOException e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }

    }
}
