import java.util.ArrayList;

public class Shirt {
    private int pointer = 0;
    private Shirt[] shirtArr = new Shirt[11];
    private String lineFull;

    Shirt(){};
    Shirt(String line) {
        this.lineFull = line;
    }

    public void add(String line) {
        shirtArr[pointer++] = new Shirt(line);
    }

    public void out() {
        for(Shirt x: shirtArr) {
            System.out.println(x.lineFull);
        }
    }
}