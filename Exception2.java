import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner cin = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String str = cin.next();
            int i = Integer.parseInt(str);
            System.out.println(2 / i);
        }catch(Exception e) {
            System.out.println("Exception happened!");
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}
