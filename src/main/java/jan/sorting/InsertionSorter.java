package jan.sorting;

public class InsertionSorter implements ISorter{
    public <T extends Comparable> T[] sort(T[] a) {
        T tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j].compareTo(a[j-1]) < 0)
                {
                    tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
        return a;
    }
}
