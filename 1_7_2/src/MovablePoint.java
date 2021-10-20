public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "Point (" + x + ", " + y + ")";
    }

    public void moveUp(){
        this.y += ySpeed;
    }

    public void moveDown(){
        this.y -= ySpeed;
    }

    public void moveRight(){
        this.x += xSpeed;
    }

    public void moveLeft(){
        this.x -= xSpeed;
    }
}
