public class Student {
    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMark() {return this.mark; }

    public void setMark(int mark) {this.mark = mark; }

    @Override
    public String toString(){
        return "| ID - " + this.id + ", name - " + this.name + ", mark - " + this.mark + " |";
    }
}