import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int switcher;

        Test test = new Test();
        do {
            System.out.print("\nКакой список будем тестировать?\n  1 - WaitList\n  2 - UnfairWaitList\n  3 - BoundedWaitList\nНомер - ");
            switcher = cin.nextInt();
            switch (switcher) {
                case 1:
                    test.testWaitList();
                    break;
                case 2:
                    test.testUnfairWaitList();
                    break;
                case 3:
                    test.testBoundedWaitList();
                    break;
                default:
                    break;
            }
            System.out.print("\nВыход?\n  0 - выход\n  4 - еще раз\nНомер - ");
            switcher = cin.nextInt();
        }while(switcher!=0);
    }
}
