public class Book implements Priceble{
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
