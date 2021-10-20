public class shelf extends furniture{
    class color{
        private String color;
        public color(String color){
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    class width{
        private double width;
        public width(double width){
            this.width = width;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

    }

    class length{
        private double length;
        public length(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
    }

    class depth{
        private double depth;

        public depth(double depth) {
            this.depth = depth;
        }

        public double getDepth() {
            return depth;
        }

        public void setDepth(double depth) {
            this.depth = depth;
        }
    }

    color c;
    depth d;
    length l;
    width w;

    public shelf(String color, double width, double length, double depth){
        c = new color(color);
        d = new depth(depth);
        l = new length(length);
        w = new width(width);
    }


    @Override
    public double getVolume(){
        return w.getWidth()*d.getDepth()*l.getLength();
    }

    @Override
    public String toString(){
        return "Shelf. Color - " + c.getColor() + ", width - " + w.getWidth() + ", length - " + l.getLength() + ", depth - " + d.getDepth() + ", volume - " + this.getVolume();
    }
}