import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String str = "32/01/1901";
        Pattern pattern = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/19\\d{2}$");
        Matcher m;
        System.out.println(pattern.matcher(str).find());

    }
}
