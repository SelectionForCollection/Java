import java.util.ArrayList;
import java.util.StringTokenizer;

public class Person {
    private String f;
    private String i;
    private String o;
    private StringTokenizer st;

    Person(String line) {
        this.st = new StringTokenizer(line, " ");
    }

    public String writeFIO() {
        String str = "";
        int i = 0;
        while (st.hasMoreTokens()) {
            if(i == 0){
                str += st.nextToken() + " ";
            }else{
                str += st.nextToken().charAt(0) + ".";
            }
            i++;
        }
        return str;
    }
}