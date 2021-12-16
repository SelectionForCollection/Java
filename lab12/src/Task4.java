import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Pattern.compile("\\d+\\s*\\+").matcher(" (1 - 8) – 9 / 4 +").find());
    }
}