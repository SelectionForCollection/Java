import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task4 {
    public static void main(String[] args) {
        Date date = new Date(117, 2, 3, 3, 3);
        Calendar calendar = new GregorianCalendar(2017, 2, 3, 3, 3);

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("<y><MMMM><dd>\n<h><m>");

        System.out.println(sdf.format(date.getTime()));
        System.out.println(sdf.format(calendar.getTime()));

    }
}