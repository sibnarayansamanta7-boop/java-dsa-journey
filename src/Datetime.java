import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        LocalDateTime datetime = LocalDateTime.now();
        String newDateTime = datetime.format(formatter);

        System.out.println(newDateTime);
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
