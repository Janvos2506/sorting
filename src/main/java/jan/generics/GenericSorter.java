package jan.generics;

public class GenericSorter {

    public <T extends Comparable> T min(T[] a)
    {
        T smallest = a[0];
        for(T element: a) {
            if(element.compareTo(smallest) < 0)
                smallest = element;
        }
        return smallest;
    }
}
