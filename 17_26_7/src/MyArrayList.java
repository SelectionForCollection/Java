public class MyArrayList<T> {
    private final int INIT_SIZE = 20;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for(int i = index; i< pointer; i++){
            array[i] = array[i+1];
            //array[pointer] =null;
        }
        pointer--;
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;

        if(array.length/pointer>3){
            Object[] newArray1 = new Object[array.length/2];
            for(int i = 0; i<array.length/2; i++){
                newArray1[i] = array[i];
            }
            array = newArray1;
        }
    }

    public void set(int index, T item){
        for(int i = 0; i<pointer; i++){
            if(i == index){
                array[i] = item;
            }
        }
    }
}