public class Square extends Rectangle {
    public Square() {    }

    public Square(double side){
        this.width = this.length = side;
        this.color = "not installed";
        this.filled = false;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return this.width;
    }

    public void setSide(double side){
        this.width = side;
    }


    @Override
    public void setWidth(double side){
        this.width = side;
    }

    @Override
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString(){
        return "Shape: square; width: "+this.width+", length: "+this.length;
    }

}
