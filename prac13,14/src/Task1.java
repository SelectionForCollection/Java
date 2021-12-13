import java.util.Date;

public class Task1 {
    final String F = "Лисютин";
    final String I = "Дмитрий";
    final String O = "Анатольевич";

    public void information() {
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Разработчик - " + F + " "+ I + " "+ " " + O + "\n");
        System.out.println("Время получение заказа - Thu Dec 09 23:19:41 MSK 2021");
        System.out.println("Время сдачи заказа - " + date);
    }

    public static void main(String[] args) {
        new Task1().information();
    }
}