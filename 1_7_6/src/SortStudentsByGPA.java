public class SortStudentsByGPA implements Comparator {
    private Student[] source;
    private int leftBorder;
    private int rightBorder;

    public SortStudentsByGPA(Student[] source, int leftBorder, int rightBorder){
        this.source = source;
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        Comparator.quickSort(source, leftBorder, rightBorder);
    }
}
