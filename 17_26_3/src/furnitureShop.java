public class furnitureShop {
    public static void main(String[] args) {
        wardrobe w1 = new wardrobe("RED", 100, 250, 50);
        System.out.println("(" + w1 + ") - Цена 1р");
        shelf s1 = new shelf("BLUE", 50,70, 30);
        System.out.println("(" + s1 + ") - Цена 2р");
        w1.c.setColor("YELLOW");
        s1.c.setColor("BLACK");
        System.out.println("\n");
        System.out.println("(" + w1 + ") - Цена 1р");
        System.out.println("(" + s1 + ") - Цена 2р");
    }
}
