import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
//        MyArrayList<String> arr = new MyArrayList<>();
//        for(int i = 0; i<20; i++){
//            System.out.print("Введите элемент с индексом" + i + " ");
//            arr.add(cin.nextLine());
//        }
//        System.out.println();
//        for(int i = 0; i< arr.size();i++){
//            System.out.println(i + " " + arr.get(i));
//        }
//        arr.remove(1);
//        System.out.println();
//        for(int i = 0; i< arr.size();i++){
//            System.out.println(i + " " + arr.get(i));
//        }
//        arr.set(0,"Изменен)))))))))))))))))))))))))))))");
//        System.out.println();
//        for(int i = 0; i< arr.size();i++){
//            System.out.println(i + " " + arr.get(i));
//        }
        //////////////////////////////////////////////////////////////////////////////////////////////////
        MyArrayList<Integer> arr1 = new MyArrayList<>();
        for(int i = 0; i<20; i++){
            System.out.print("Введите элемент с индексом " + i + " ");
            arr1.add(cin.nextInt());
        }
        System.out.println();
        for(int i = 0; i< arr1.size();i++){
            System.out.println(i + " "+ arr1.get(i));
        }
        arr1.remove(1);
        System.out.println();
        for(int i = 0; i< arr1.size();i++){
            System.out.println(i + " "+ arr1.get(i));
        }
        arr1.set(0,5555555);
        System.out.println();
        for(int i = 0; i< arr1.size();i++){
            System.out.println(i + " "+ arr1.get(i));
        }
    }
}
