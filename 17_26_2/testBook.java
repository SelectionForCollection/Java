public class testBook {
    public static void main(String[] args) {
        Book b1 = new Book("Война и мир", "Лев Толстой", 1867);
        System.out.println(b1.toString());
        b1.setAuthor("Маяковский");
        b1.setTitle("Облако в штанах");
        b1.setYear(1915);
        System.out.println(b1.toString());
    }
}
