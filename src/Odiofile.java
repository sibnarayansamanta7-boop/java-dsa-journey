import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Odiofile {
    public static void main(String[] args){

        String filepath = "src/leberch-relaxing-626783.wav";
        Scanner sc = new Scanner(System.in);

        File file = new File(filepath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = " ";
            while (!response.equals("Q")){
                System.out.print("P = Play");
                System.out.print("S = Stop");
                System.out.print("R = Reset");
                System.out.print("Q = Quit");
                System.out.print("Enter your choice :");

                response = sc.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye!");
            sc.close();
        }
    }
}
