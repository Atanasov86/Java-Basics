import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy h:mm:a");
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }
}
