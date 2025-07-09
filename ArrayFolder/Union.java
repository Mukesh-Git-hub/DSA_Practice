package ArrayFolder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {
    void call(int []array,int[] array2){
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<array.length;i++){
            s.add(array[i]);
        }
        for(int i=0;i<array2.length;i++){
            s.add(array2[i]);
        }

        int[] union=new int[s.size()];

      Integer temp[]=s.toArray(new Integer[s.size()+3]);

        for (int i = 0; i < temp.length; i++) {
            union[i] = temp[i];
        }
        System.out.println("int[] array: " + Arrays.toString(union));
    }



}
