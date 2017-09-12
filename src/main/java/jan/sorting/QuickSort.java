package jan.sorting;

public class QuickSort implements ISorter {

    public <T extends Comparable> T[] sort(T[] a) {
        return (T[]) quickSort(a,0,a.length-1);
    }

    int partition(Comparable a[], int l, int r)
    {
        Comparable pivot = a[r];
        int i = (l-1);
        for (int j=l; j<r; j++)
        {
            if (a[j].compareTo(pivot) <= 0)
            {
                i++;
                Comparable tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }

        Comparable tmp = a[i+1];
        a[i+1] = a[r];
        a[r] = tmp;

        return i+1;
    }

    Comparable[] quickSort(Comparable[] a, int l, int r)
    {
        if (l < r)
        {
            int pivot = partition(a, l, r);

            quickSort(a, l, pivot-1);
            quickSort(a, pivot+1, r);
        }
        return a;
    }
}
