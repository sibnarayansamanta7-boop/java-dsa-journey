import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereaders {
    public static void main(String[] args) throws FileNotFoundException {

        String filepath="text.reader";

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            System.out.println("That file exits");
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException("Something went wrong");
        }
    }

}
