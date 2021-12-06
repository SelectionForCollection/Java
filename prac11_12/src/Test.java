import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Person p1 = new Person("Лисютин Дмитрий Анатольевич");
        System.out.println(p1.writeFIO());
        //__________________________________________________________________________________________
        Address a1 = new Address("Страна/ Регион/ Город/ Улица/ Дом/ Корпус/ Квартира");
        a1.out();
        Address a2 = new Address("Страна1! Регион1! Город1! Улица1! Дом1! Корпус1! Квартира1");
        a2.out();
        //__________________________________________________________________________________________
        Shirt s1 = new Shirt();
        String shirts[] = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL"; 
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (String x: shirts) {
            s1.add(x);
        }
        s1.out();
        //________________________________________________________________________________________
        PhoneNumber ph1 = new PhoneNumber("45679161337719");
        ph1.format();
        //________________________________________________________________________________________
        File file = new File("file.txt");
        String buffer = "";
        Scanner cin = new Scanner(file);
        while(cin.hasNextLine()) {
            buffer+=cin.nextLine();
        }
        String[] words = buffer.split(" ");

    }
}
