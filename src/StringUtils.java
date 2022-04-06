/**
 * 
 * 
*/
public class StringUtils {
    //remove when finished with project
    public void boilerPlateCode(){
        StringUtils stringUtils = new StringUtils();
        stringUtils.printOpening("XYZ");

        long start = System.nanoTime();

        //logic here

        long duration = (System.nanoTime() - start)/1000000;
        stringUtils.printClosing("XYZ", duration);
    }

    public void printOpening(String searchMethod){
        System.out.println();
        System.out.println("============");
        System.out.println(searchMethod + " Algorithm");
        System.out.println("------------");
    }

    public void printClosing(String searchMethod, long duration){
        System.out.println("\n" + searchMethod + " execution duration: " + duration + "ms");
        System.out.println("============");
    }
}