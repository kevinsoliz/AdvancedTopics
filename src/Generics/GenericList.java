package Generics;
//la T representa el objeto que queremos guardar en la lista
public class GenericList<T> { //this T is bounded, is restricted
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
