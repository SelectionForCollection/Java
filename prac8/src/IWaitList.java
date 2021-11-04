import java.util.Collection;

public interface IWaitList<T> {
    void add(T element);
    T remove();
    boolean contains(T element);
    boolean containsAll(Collection<T> Collection);
    boolean isEmpty();

}
