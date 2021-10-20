public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
/*
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    */

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public void moveUp() {
        center.moveUp();
    };
    public void moveDown(){
        center.moveDown();
    };
    public void moveLeft(){
        center.moveLeft();
    };
    public void moveRight() {
        center.moveRight();

    };

    @Override
    public String toString(){
        return "Circle (" + center.x + ", " + center.y + ")" + ", radius is " + radius;
    }
}
