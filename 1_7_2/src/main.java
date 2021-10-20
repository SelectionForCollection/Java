public class main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(4, 3, 21, 13);

        System.out.print("До перемещения - " + point);
        point.moveUp();
        point.moveLeft();
        System.out.println(". После - " + point);

        MovableCircle circle = new MovableCircle(33, 23, 4, -1, 2);
        System.out.print("До перемещения - " + circle);
        circle.moveDown();
        circle.moveRight();
        System.out.println(". После - " + circle);

        MovableRectangle rectangle = new MovableRectangle(0, 3, 4, 0, 1, 1);
        System.out.print( "До перемещения - " + rectangle);
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(". После - " +rectangle);




    }
}