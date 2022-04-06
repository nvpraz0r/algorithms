public class InterpolationSearch {
    public void search(){
        StringUtils stringUtils = new StringUtils();
        stringUtils.printOpening("Interpolation Search");

        long start = System.nanoTime();

        //logic here

        long duration = (System.nanoTime() - start)/1000000;
        stringUtils.printClosing("XYZ", duration);
    }
}
