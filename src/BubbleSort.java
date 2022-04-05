/**
 * Run time complexity: O(n^2) - runs in quadratic time
 * The larger the data set the more inefficient this sorting method becomes
 *      -insertion sort
 *      -selection sort
 *      -bubblesort
*/

public class BubbleSort {

    //
    public void sort(){
        System.out.println();
        System.out.println("============");
        System.out.println("Bubble Sort Algorithm");
        System.out.println("------------");

        long start = System.nanoTime();

        int array[] = {9,3,4,2,1,8,7,6,5};

        //bubbleSort array takes array parameter to sort
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                //compare adjacent numbers
                //if the element to the left is larger
                if(array[j] > array[j + 1]){
                    //set current element to temp
                    int temp = array[j];
                    //set current element to the element in the next position
                    array[j] = array[j + 1];
                    //set element in the next position to temp
                    array[j + 1] = temp;
                    //NTS: essentially it swaps the position of the two
                }
            }
        }
    
        //print sorted elements in array
        for(int i: array){
            System.out.print(i + "");
        }

        long duration = (System.nanoTime() - start)/1000000;
        System.out.println("\nBubble sort execution duration: " + duration + "ms");
        System.out.println("============");
    }
}
