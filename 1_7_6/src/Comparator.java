import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Comparator {
        public static void quickSort(Student[] source, int leftBorder, int rightBorder) {
            int leftMarker = leftBorder;
            int rightMarker = rightBorder;
            int pivot = source[(leftMarker + rightMarker) / 2].getMark();
            do {
                // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
                while (source[leftMarker].getMark() > pivot) {
                    leftMarker++;
                }
                // Двигаем правый маркер, пока элемент больше, чем pivot
                while (source[rightMarker].getMark() < pivot) {
                    rightMarker--;
                }
                // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
                if (leftMarker <= rightMarker) {
                    // Левый маркер будет меньше правого только если мы должны выполнить swap
                    if (leftMarker < rightMarker) {
                        int tmpMark = source[leftMarker].getMark();
                        source[leftMarker].setMark(source[rightMarker].getMark());
                        source[rightMarker].setMark(tmpMark);

                        String tmpName = source[leftMarker].getName();
                        source[leftMarker].setName(source[rightMarker].getName());
                        source[rightMarker].setName(tmpName);

                        int tmpID = source[leftMarker].getID();
                        source[leftMarker].setID(source[rightMarker].getID());
                        source[rightMarker].setID(tmpID);
                    }
                    // Сдвигаем маркеры, чтобы получить новые границы
                    leftMarker++;
                    rightMarker--;
                }
            } while (leftMarker <= rightMarker);

            // Выполняем рекурсивно для частей
            if (leftMarker < rightBorder) {
                quickSort(source, leftMarker, rightBorder);
            }
            if (leftBorder < rightMarker) {
                quickSort(source, leftBorder, rightMarker);
            }

        }

    public static void mergeSort(Student[] source, int left, int right) {
        // Выберем разделитель, т.е. разделим пополам входной массив
        int delimiter = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        // Создаём временный массив с нужным размером
        Student[] buffer = new Student[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
            if (delimiter > right || source[cursor].getMark() > source[delimiter].getMark()) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }
}
