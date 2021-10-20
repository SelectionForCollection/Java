import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Выберите номер задания:\n 1 - р12\n 2 - p13\n 3 - p14\n 4 - p15\nНомер - ");
        int s = cin.nextInt();
        switch (s){
            case 1:
                new p12();
                break;
            case 2:
                new p13();
                break;
            case 3:
                new p14(1234567);
                break;
            case 4:
                new p15(1234567);
                break;
            default:
                break;
        }
    }
}
