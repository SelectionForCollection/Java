import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<T> extends WaitList {
    private int capacity;

    BoundedWaitList(int capacity){
        content = new ConcurrentLinkedQueue<T>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Object element){
        if(content.size()<capacity){
            System.out.println("Элемент '" + element + "' был добавлен? " + content.add(element));
        }else{
            System.out.println("Элемент '" + element + "' не был добавлен, так как в списке не может быть больше " + getCapacity() + " элементов");
        }
    }

    public String toString(){
        System.out.print("Список - ");
        return content.toString();
    }
}
