import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        

        Date currentDate = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String formattedDate = formatter.format(currentDate);

        System.out.println("Formatted Date: " + formattedDate);

        

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(currentDate);

        calendar.add(Calendar.DAY_OF_MONTH, 5);

        Date futureDate = calendar.getTime();

        
        
        String formattedFutureDate = formatter.format(futureDate);
        System.out.println("Date after 5 days: " + formattedFutureDate);
    }
}
