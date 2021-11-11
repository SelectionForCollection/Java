import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<T> extends WaitList {
    protected ConcurrentLinkedQueue<T> deletedElements;

    UnfairWaitList(){
    }

    public void remove(T element){
        if(content.peek() != element){
            content.remove(element);
        }else{
            System.out.println("Первый элемент удалить нельзя");
        }
    }

    public void moveToBack(T element){
        if(this.content.remove(element)) {
            this.content.add(element);
        }
    }

    @Override
    public void add(Object element) {
        if(deletedElements != null){
            if(!deletedElements.contains(element)){
                super.add(element);
            }else{
                super.add(deletedElements.element());
                deletedElements.remove(element);
            }
        }else{
            super.add(element);
        }

    }

    public String toString(){
        System.out.print("Список - ");
        return content.toString();
    }
}
