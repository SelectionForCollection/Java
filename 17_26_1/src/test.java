import java.util.Scanner;

class test {
    public test(String[] args) {
        args = new String[10];
        Scanner cin  = new Scanner(System.in);
        for(int i = 0; i< args.length; i++){
            args[i] = cin.nextLine();
        }

        for (int i = 0; i < args.length; i++)
            System.out.print(args[i] + " ");
        }
}