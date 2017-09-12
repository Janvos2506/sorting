package jan.sorting;

public class BubbleSort implements ISorter {
    public <T extends Comparable> T[] sort(T[] a) {
        T tmp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j-1].compareTo(a[j]) > 0) {
                    tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
        return a;
    }
}
