public class Person {
    private String f;
    private String i;
    private String o;
    private String fio[];

    Person(String line) {
        this.fio = line.split(" ");
        this.f = fio[0];
        this.i = fio[1];
        this.o = fio[2];
    }

    public String writeFIO() {
        return f + " " + i.charAt(0) + "." + o.charAt(0) + ".";
    }
}