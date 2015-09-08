import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DaysBetweenTwoDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date startDate = format.parse(scanner.nextLine());
            Date endDate = format.parse(scanner.nextLine());
            long difference = endDate.getTime() - startDate.getTime();
            difference = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
            System.out.println("" + difference);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }
}
