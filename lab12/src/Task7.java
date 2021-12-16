import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String str = "As13fhgfhgfhg";
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}");
        Matcher m;
        System.out.println(pattern.matcher(str).find());
    }
}