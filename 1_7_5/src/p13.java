import java.util.ArrayList;
import java.util.Scanner;

public class p13 {
    static int counter = 0;
    public p13() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int x;
        Scanner cin = new Scanner(System.in);
        System.out.print("Введите число(выход - 0): ");
        x = cin.nextInt();
        if (x != 0) {
            counter++;
            if((counter % 2 )!= 0) {
                System.out.println("Нечетное число " + x);
                new p13();
            }
            new p13();
        }
    }
}