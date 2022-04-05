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
        System.out.println();
        System.out.println("============");
        System.out.println("Linear Search Algorithm");
        System.out.println("------------");

        long start = System.nanoTime();

        int array[] = {5,3,2,9,1,6,7,8,4};
        int target = 1;

        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                System.out.println("Target found at position: " + array[i]);
            }
        }

        long duration = (System.nanoTime() - start)/1000000;
        System.out.println("Linear search execution duration: " + duration + "ms");
        System.out.println("============");
    }
}
