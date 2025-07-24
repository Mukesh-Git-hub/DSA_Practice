package ArrayFolder.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {2, 8, 8, 8, 8, 8, 11, 13};
        int array2[]={4,5,1,7,11,100};
//        Floor f = new Floor();
//        System.out.println(f.call(array,20));
//       Ceil c = new Ceil();
//        System.out.println(c.call(array,40));
//        firstAndLastOccurence fandl = new firstAndLastOccurence();
//        System.out.println(Arrays.toString(fandl.callMethod(array)));
        MiniBs d = new MiniBs();
        int result=d.call(array2);
        System.out.println("result: "+result);
   }
}