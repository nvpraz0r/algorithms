/**
 * Run time complexity: O(n)
 * 
 * Slow for large data sets
 * 
 * Fart for searches of small to medium data sets
 * does not need to sort
 * Useful for structures without random access
 * 
*/
public class LinearSearch {
    //
    public void search(){

        StringUtils stringUtils = new StringUtils();
        stringUtils.printOpening("Linear Search");

        long start = System.nanoTime();

        int array[] = {5,3,2,9,1,6,7,8,4};
        int target = 1;

        //loop through each element of the array
        for(int i = 0; i < array.length; i++){
            //if the element at the current position
            //is equal to the target print message
            //doing nothing else
            if(array[i] == target){
                System.out.println("Target( "+ target + " ) found at position: " + i);
            }
        }

        long duration = (System.nanoTime() - start)/1000000;
        stringUtils.printClosing("Linear Search", duration);
    }
}
