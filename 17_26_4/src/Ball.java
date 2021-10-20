public class Ball implements Priceble {
    String color;
    String maker;
    int price;

    Ball(String color, String maker, int price){
        this.color = color;
        this.maker = maker;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
