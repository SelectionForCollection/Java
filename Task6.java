import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String str = "sdf@example.";
        Pattern pattern = Pattern.compile("(\\w+)(@)(\\w+)([.]?)(\\w+)$");
        Matcher m;
        System.out.println(pattern.matcher(str).find());
    }
}
