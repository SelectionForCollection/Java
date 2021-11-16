import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Мельникова Ксения Витальевна", 10000001));
        students.add(new Student("Иванова София Иванова", 20000002));
        students.add(new Student("Сапсай Иван Алексеевич", 30000003));
        students.add(new Student("Шпак Ангелина Эдуардовна", 40000004));
        students.add(new Student("Богословский Артем Михайлович", 50000005));
        students.add(new Student("Ардаков Игорь Герасимович", 60000006));

        new Gui(students).setVisible(true);
    }
}
