import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;

public class main{
    public static Stack<Integer> player1 = new Stack<Integer>();
    public static Stack<Integer> player2 = new Stack<Integer>();

    public static void main(String[] args) {
        String x = "", y = "", flag ="";
        Scanner cin = new Scanner(System.in);

        System.out.print("Введите карты первого ирока: ");
        x = cin.nextLine();
        x = x.substring(0, 9);
        for(int i = 0; i < 9; i++) {
            if(i != 0) {
                if ((x.charAt(i) != ' ') & (x.charAt(i - 1) != ' ')) {
                    System.out.println("Некорректный ввод.\nНа вход принимаются числа только в промежутке от 0 до 9.\nТакже можете проверить пробелы.");
                    System.exit(0);
                }
            }
        }

        System.out.print("Введите карты первого ирока: ");
        y = cin.nextLine();
        y = y.substring(0, 9);
        for(int i = 0; i < 9; i++) {
            if(i != 0) {
                if ((y.charAt(i) != ' ') & (y.charAt(i - 1) != ' ')) {
                    System.out.println("Некорректный ввод.\nНа вход принимаются числа только в промежутке от 0 до 9.\nТакже можете проверить пробелы.");
                    System.exit(0);
                }
            }
        }

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if((x.charAt(i)!=' ') & (x.charAt(i)==y.charAt(j))){
                    System.out.println("Некоррекнтый ввод. Элементы повторяются.");
                    System.exit(0);
                }
            }
        }

        for(int i = 8; i >= 0; i--){
            if(x.charAt(i) != y.charAt(i)){
                player1.push(x.charAt(i) - '0');
                player2.push(y.charAt(i) - '0');
            }
        }


        new Step(player1, player2);


    }
}