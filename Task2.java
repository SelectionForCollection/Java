import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final String s = "abcdefghijklmnopqrstuv18340";
        Scanner cin = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = cin.nextLine();
        if(str.equals(s)){
            System.out.println("Строка верна");
        }else{
            System.out.println("Строка не верна");
        }
    }
}