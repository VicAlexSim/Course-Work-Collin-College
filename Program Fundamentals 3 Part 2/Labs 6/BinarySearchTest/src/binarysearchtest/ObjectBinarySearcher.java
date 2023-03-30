/**
 * Victor Sim
 * 7/20/22
 * JDK 17.0.2
 * ObjectBinarySearcher Class (is called after ObjectQuickSorter is called)
 */
//Package statement
package binarysearchtest;

//Class definition, has to be already sorted
public class ObjectBinarySearcher {

    //Field/Members initialized
    private Comparable[] list;
    private int numberOfElements;
    private int first, last, pivot;

    //Constructors
    public ObjectBinarySearcher() {
    }

    public ObjectBinarySearcher(Comparable[] list, int numberOfElements) {
        this.list = list;
        this.numberOfElements = numberOfElements;
    }

    //Getters & Setters
    public Comparable[] getList() {
        return list;
    }

    public void setList(Comparable[] list) {
        this.list = list;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }
    
    //addElement method for Comparable objects Array
    public void addElements(Comparable temp, int index) {
        this.list[index] = temp;
    }

    //Input to the method should be an object that implements Comparable not String
    public int searchElement(Comparable element) {
        //First index
        this.first = 0;
        //Last index
        this.last = this.numberOfElements - 1;

        //While first <= last
        while (this.first <= this.last) {
        //Calculate pivot by this formula
            this.pivot = (this.first + this.last) / 2;

            //Comparing pivot to the element to be searched
            //If found, return Pivot index (Base case)
            //No need to convert it to String for conversion, since String/Wrapper classes implements Comparable interface hence it will implement compareto method
            if (this.list[pivot].compareTo(element) == 0) {
                return pivot;
            } 
            /*If the pivot element is greater than the string
             *to be searched, then bring last to pivot - 1
             *and continue searching left of the pivot
             */
            else if (this.list[pivot].compareTo(element) > 0) {
                this.last = this.pivot - 1;
            } 
            /*If pivot element is lesser than the item
             *to be searched, then bring first to pivot + 1 
             *and continue searching right of the pivot
             */
            else {
                this.first = this.pivot + 1;
            }
        }

        //If element is not found
        return -1;
    }
}
