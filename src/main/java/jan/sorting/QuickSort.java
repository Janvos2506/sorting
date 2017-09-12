package jan.sorting;

public class QuickSort implements ISorter {
    public int[] sort(int[] a) {
        return quickSort(a,0,a.length-1);
    }

    int partition(int a[], int l, int r)
    {
        int pivot = a[r];
        int i = (l-1);
        for (int j=l; j<r; j++)
        {
            if (a[j] <= pivot)
            {
                i++;

                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }

        int tmp = a[i+1];
        a[i+1] = a[r];
        a[r] = tmp;

        return i+1;
    }

    int[] quickSort(int[] a, int l, int r)
    {
        if (l < r)
        {
            int pivot = partition(a, l, r);

            quickSort(a, l, pivot-1);
            quickSort(a, pivot+1, r);
        }
        return a;
    }

    public int getPivot(int[] a) {
        int l = a[0];
        int r = a[a.length-1];
        int c = a[(a.length-1)/2];

        if(l > c && l < r) return l;
        if(c > l && c < r) return c;
        if(r > c && r < l) return r;
        return 0;
    }
}
