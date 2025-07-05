package Collectpackage;

import java.util.*;

public class Collectset {
   static boolean call(int []array){
        int n= array.length;
        for(int i=0;i<=n-2;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        TreeSet<Integer> s=new TreeSet<>();
         for(int i=0;i<1000000;i++){
             s.add(i+85);
         }int[] arr = s.stream().mapToInt(i -> i).toArray();
        System.out.println(call(arr));

    }
}
