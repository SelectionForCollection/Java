public class Student {
    private String FIO;
    private long INN;

    Student(){};
    Student(String FIO, long INN){
        this.FIO = FIO;
        this.INN = INN;
    };

    public long getINN() {
        return INN;
    }

    public void setINN(long INN) {
        this.INN = INN;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
}