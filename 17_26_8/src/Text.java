import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text {
    File file = new File("D://IntelliJ IDEA/projects1/17_26_8/src/myFile.txt");
    String buffer = "";
    String buffer1 = "";
    void output() throws FileNotFoundException {
        Scanner cin = new Scanner(file);
        System.out.println("Содержимое файла:");
        while(cin.hasNextLine()){
            System.out.println(cin.nextLine());
        }
    }

    void input() throws IOException {
        Scanner cin = new Scanner(System.in);
        Scanner cin1 = new Scanner(file);
        System.out.println("Введите то, что нужно добавить в конец файла:");
        buffer = cin.nextLine();
        while(cin1.hasNextLine()){
            buffer1+=cin1.nextLine()+"\n";
        }
        FileWriter edit = new FileWriter(file, false);
        edit.write(buffer1+buffer);
        edit.flush();
    }
}
