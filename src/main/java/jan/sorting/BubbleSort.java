package jan.sorting;

public class BubbleSort implements ISorter {
    public int[] sort(int[] a) {
        int tmp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j-1] > a[j]) {
                    tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
        return a;
    }
}
