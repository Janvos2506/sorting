package jan;

import jan.generics.GenericSorter;
import jan.sorting.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AppTest
{

    private ArrayList<ISorter> sorters = new ArrayList<ISorter>();

    @Before
    public void setup() {
        sorters.add(new InsertionSorter());
        sorters.add(new BubbleSort());
        sorters.add(new QuickSort());
        sorters.add(new MergeSort());

    }

    @Test
    public void testSmallestString()
    {
        GenericSorter gs = new GenericSorter();
        String[] testArray = {"abc","aa","mooi","kut","a","nb"};
        assertEquals("a",gs.min(testArray));
    }

    @Test
    public void testSortersEqual() {
        Integer[] toSort = {5,5,5,5,5,5,5,5,5,5};
        testSorters(toSort,toSort);
    }

    @Test
    public void testSortersAlreadySorted() {
        Integer[] toSort = {1,2,3,4,5,6,7,8,9,10};
        testSorters(toSort,toSort);
    }

    @Test
    public void testSortersReverseOrder() {
        Integer[] toSort = {10,9,8,7,6,5,4,3,2,1};
        Integer[] sorted = {1,2,3,4,5,6,7,8,9,10};
        testSorters(sorted,toSort);
    }

    @Test
    public void testSorterRandomOrderEven() {
        Integer[] toSort = {1,4,1,5,9,2,6,5,3,5};
        Integer[] sorted = {1,1,2,3,4,5,5,5,6,9};
        testSorters(sorted,toSort);
    }

    @Test
    public void testSorterRandomOrderOdd() {
        Integer[] toSort = {1,4,1,5,9,2,6,5,3};
        Integer[] sorted = {1,1,2,3,4,5,5,6,9};
        testSorters(sorted,toSort);
    }

    public <T extends Comparable> void testSorters(T[] sorted, T[] toSort) {
        T[] sortedOriginal = sorted.clone();
        T[] toSortOriginal = toSort.clone();
        for(ISorter sorter: sorters) {
            sorted = sortedOriginal.clone();
            toSort = toSortOriginal.clone();
            assertArrayEquals(sorted,sorter.sort(toSort));
        }
    }


    public void printArray(int[] a)
    {
        System.out.print("[");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]);
            System.out.print(",");
        }
        System.out.print(a[a.length-1]);
        System.out.println("]");
    }

}
