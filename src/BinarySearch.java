/**
 * Run time complexity: O(log n)
 * 
*/
public class BinarySearch {
    //
    public void search(){

        StringUtils stringUtils = new StringUtils();
        stringUtils.printOpening("Binary Search");

        long start = System.nanoTime();

        

        long duration = (System.nanoTime() - start)/1000000;
        stringUtils.printClosing("Binary Search", duration);
    }
}