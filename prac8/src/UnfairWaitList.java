import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<T> extends WaitList {
    UnfairWaitList(){
        content = new ConcurrentLinkedQueue<T>();
        content.add(1);
        content.add(2);
        content.add(3);
        content.add(4);
        content.add(5);
    };
    public void remove(T element){
        content.remove(element);
    }
    public void moveToBack(T element){
        int pointer  = 0;
        List list = content.stream().toList();
        for(int i = 0; i< list.size(); i++){
            if(list.get(i) == element){
                pointer = i;
                break;
            }
        }
        for(int i = pointer; pointer< list.size(); i++){
            if(i != list.size()-1) {
                list.set(i, list.get(i + 1));
            }else{
                list.set(i, list.get(i + 1));
                list.set(i+1, element);
            }
        }
    }
}
