public class Exception1 {
    public void firstListing(){
        System.out.println(2/0);
    }
    public void secondListing(){
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        new Exception1().firstListing();
        new Exception1().secondListing();
    }
}
