/**
 * Victor Sim
 * 7/20/22
 * JDK 17.0.2
 * ObjectQuickSort Class (is called before ObjectBinarySearcher is called)
 */
//Package statement
package binarysearchtest;

//Class definition
public class ObjectQuickSorter {

    //Field/Members initialized
    private Comparable[] list;

    //Constructor
    public ObjectQuickSorter(Comparable[] list) {
        this.list = list;
    }

    //Quicksort Method
    public void quickSort() {
        doQuickSort(list, 0, list.length - 1);
    }

    //doQuickSort Method
    private void doQuickSort(Comparable[] array, int start, int end) {
        int pivotPoint;

        if (start < end) {
            //Get pivot point
            pivotPoint = partition(array, start, end);

            //Sort First Sublist
            doQuickSort(array, start, pivotPoint - 1);

            //Sort Second Sublist
            doQuickSort(array, pivotPoint + 1, end);
        }
    }

    //Partition Method
    private int partition(Comparable[] array, int start, int end) {
        Comparable pivotValue; // To hold the pivot value
        int endOfLeftList; // Last element in the left sublist.
        int mid; // To hold the mid-point subscript

        // Find the subscript of the middle element.
        // This will be our pivot value.
        mid = (start + end) / 2;

        // Swap the middle element with the first element.
        // This moves the pivot value to the start of
        // the list.
        swap(array, start, mid);

        // Save the pivot value for comparisons.
        pivotValue = array[start];

        // For now, the end of the left sublist is
        // the first element.
        endOfLeftList = start;

        // Scan the entire list and move any values that
        // are less than the pivot value to the left
        // sublist.
        for (int scan = start + 1; scan <= end; scan++) {
            if (array[scan].compareTo(pivotValue) < 0) {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }

        // Move the pivot value to end of the
        // left sublist.
        swap(array, start, endOfLeftList);

        // Return the subscript of the pivot value.
        return endOfLeftList;
    }

    private void swap(Comparable[] array, int a, int b) {
        Comparable temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
