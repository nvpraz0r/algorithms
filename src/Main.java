/**
 * 
 * 
 * 
 * 
*/

public class Main{
    public static void main(String[] args){
        //measure the time it took for the program to execute

        //call and run the various methods

        //call linear search
        LinearSearch linearsearch = new LinearSearch();
        linearsearch.search();

        //call binary search
        BinarySearch binarysearch = new BinarySearch();
        binarysearch.search();

        //call interpolation search
        InterpolationSearch interpolationsearch = new InterpolationSearch()
        interpolationsearch.search();

        //call bubble sort
        BubbleSort bubblesort = new BubbleSort();
        bubblesort.sort();

        //call selection sort

        //call insertion sort

        //call merge sort

        //call quick sort

    }
}