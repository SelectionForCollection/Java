public class Book {
    private String  title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Book. Title - " + this.title + ", Author - " + this.author + ", Year - " + this.year;
    }
}
