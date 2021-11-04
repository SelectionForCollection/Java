import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<T> implements IWaitList<T>{
    protected ConcurrentLinkedQueue<T> content;

    WaitList(){
        content = new ConcurrentLinkedQueue<T>();
    };
    WaitList(Collection<T> Collection){
        content = new ConcurrentLinkedQueue<T>(Collection);
    };

    public void add(T element) {
        System.out.println("Элемент '" + element + "' добавлен? " + content.offer(element));
    }

    public T remove(){
        for(T x: content) content.remove(x);
        System.out.print("Все элементы были удалены. Теперь список - ");
        return null;
    }

    public boolean contains(T element) {
        System.out.print("Содержит ли в себе '" + element + "' ? ");
        return content.contains(element);
    }

    public boolean containsAll(Collection<T> Collection) {
        System.out.print("Содержит ли в себе все элементы другого списка? ");
        return content.containsAll(Collection);
    }

    public boolean isEmpty(){
        System.out.print("Список пуст? ");
        return content.isEmpty();
    }

    public String toString(){
        System.out.print("Список - ");
        return content.toString();
    }
}
