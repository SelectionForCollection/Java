public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир","Не помню, честно",123);
        Ball ball1 = new Ball("Красный","Adidas", 32);
        System.out.println(book1.getPrice());
        System.out.println(ball1.getPrice());
    }
}
