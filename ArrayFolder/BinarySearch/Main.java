package ArrayFolder.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {2, 8, 8, 8, 8, 8, 11, 13};
//        Floor f = new Floor();
//        System.out.println(f.call(array,20));
//       Ceil c = new Ceil();
//        System.out.println(c.call(array,40));
        firstAndLastOccurence fandl = new firstAndLastOccurence();
        System.out.println(Arrays.toString(fandl.callMethod(array)));
   }
}