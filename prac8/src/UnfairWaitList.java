import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<T> extends WaitList {
    UnfairWaitList(){

    };
    public void remove(T element){
        content.remove(element);
    }
    public void moveToBack(T element){
        if(this.content.remove(element)) {
            this.content.add(element);
        }
    }
}
