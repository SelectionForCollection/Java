import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        System.out.print("Введитк паттерн: ");
        String pattern = cin.nextLine();
        System.out.println(Arrays.toString(str.split(pattern)));
    }
}