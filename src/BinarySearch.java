/**
 * INCOMPLETE
 * 
 * Run time complexity: O(log n)
 * 
*/
public class BinarySearch {
    //
    public void search(){

        StringUtils stringUtils = new StringUtils();
        stringUtils.printOpening("Binary Search");

        long start = System.nanoTime();

        int array[] = new int[100];
        int low = 0;
        int high = array.length - 1;
        int target = 77;

        while(low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];

            // System.out.println("Middle: " + value);

            if(value < target){
                low = middle + 1;
            } else if (value > target){
                high = middle - 1;
            } else {
                System.out.println("Target( "+ target + " ) found at position: " + middle);
            }
        }

        long duration = (System.nanoTime() - start)/1000000;
        stringUtils.printClosing("Binary Search", duration);
    }
}