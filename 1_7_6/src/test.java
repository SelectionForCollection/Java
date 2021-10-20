import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Student[] IDNumber = new Student[5];
        Student x0 = new Student(87, "Alex", 100);
        Student x1 = new Student(32, "Eric", 45);
        Student x2 = new Student(43, "Carl", 43);
        Student x3 = new Student(900, "Adam", 9);
        Student x4 = new Student(434, "Jacob", 78);

        IDNumber[0] = x0;
        IDNumber[1] = x1;
        IDNumber[2] = x2;
        IDNumber[3] = x3;
        IDNumber[4] = x4;

        System.out.println("Исходный массив:\n" + Arrays.toString(IDNumber)+ "\n");
        for (int left = 0; left < IDNumber.length; left++) {
            // Вытаскиваем значение элемента
            int value = IDNumber[left].getID();
            String name = IDNumber[left].getName();
            int mark = IDNumber[left].getMark();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < IDNumber[i].getID()) {
                    IDNumber[i + 1].setID(IDNumber[i].getID());
                    IDNumber[i + 1].setName(IDNumber[i].getName());
                    IDNumber[i + 1].setMark(IDNumber[i].getMark());
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            IDNumber[i + 1].setID(value);
            IDNumber[i + 1].setName(name);
            IDNumber[i + 1].setMark(mark);
        }
        System.out.println("Массив отсортированный по увеличению ID:\n" + Arrays.toString(IDNumber) + "\n");

        Comparator.quickSort(IDNumber, 0 ,4);

        System.out.println("Массив отсортированный по уменьшению mark:\n" + Arrays.toString(IDNumber) + "\n");


        Student[] IDNumber2 = new Student[5];
        Student X0 = new Student(856, "David", 10);
        Student X1 = new Student(832, "Jon", 59);
        Student X2 = new Student(843, "Маша", 4);
        Student X3 = new Student(950, "Саша", 96);
        Student X4 = new Student(44, "Паша", 65);

        IDNumber2[0] = X0;
        IDNumber2[1] = X1;
        IDNumber2[2] = X2;
        IDNumber2[3] = X3;
        IDNumber2[4] = X4;

        Student[] both = new Student[IDNumber.length+IDNumber2.length];
        for (int i = 0; i<IDNumber.length; i++){
            both[i] = new Student(IDNumber[i].getID(),IDNumber[i].getName(),IDNumber[i].getMark());
        }
        for (int i = 0; i<IDNumber2.length; i++){
            both[IDNumber.length+i] = new Student(IDNumber2[i].getID(),IDNumber2[i].getName(),IDNumber2[i].getMark());
        }
        System.out.println("Неотсортированный массив соединенный из двух:\n" + Arrays.toString(both) + "\n");

        Comparator.mergeSort(both,0, both.length-1);

        System.out.println("Отсортированный массив соединеный из двух:\n" + Arrays.toString(both));
    }
}
