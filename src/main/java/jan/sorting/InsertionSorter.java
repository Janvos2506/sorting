package jan.sorting;

public class InsertionSorter implements ISorter{

    public int[] sort(int[] a) {

        int tmp;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j] < a[j-1])
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
