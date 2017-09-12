package jan.generics;

public class MemoryCell<T> implements Comparable<T> {

    private T storedValue;

    public T read() {
        return storedValue;
    }

    public void write (T x) {
        storedValue = x;
    }

    public int compareTo(T o) {
 return 0;
    }
}
