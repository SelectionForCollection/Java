import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner cin = new Scanner(System.in);

        boolean flag = false;
        do {
            flag = false;
            System.out.print("Enter Key ");
            String key = cin.nextLine();
            try{
                printDetails(key);
            }catch (Exception e){
                flag = true;
            }
        }while (flag);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo t1 = new ThrowsDemo();
        try {
            t1.getKey();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
