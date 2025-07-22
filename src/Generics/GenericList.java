package Generics;
//la T representa el objeto que queremos guardar en la lista
public class GenericList<T> { //this T is bounded, is restricted
    private T[] items = (T[]) new Object[10]; //Type erasure: Java compiler erases this type parameters and
                                                //replaces them with a class or a interface depending on the constraints.
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
