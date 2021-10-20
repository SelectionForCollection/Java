public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("Автор1", "Название1", 1234);
        Book b2 = new Book("Автор2", "Название2", 12345);

        b1.setAuthor("edited");
        b2.setTitle("edited");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
