package Stringfolder;

import ArrayFolder.LowerBound;
import ArrayFolder.Quicksort;
import ArrayFolder.UpperBound;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[]={4,3,5,2,1,7,8,9,6};

//        Quicksort q = new Quicksort();
//        q.quicksort(array,0, array.length-1);
//        System.out.println("Sorted array: " + Arrays.toString(array));
//        LowerBound l= new LowerBound();
//        System.out.println( l.call(array,0,array.length,9));
//        UpperBound u= new UpperBound();
//        System.out.println( u.call(array,0,array.length,5));
        DeleteCharacter d = new DeleteCharacter();
       String s= d.makeFancyString("leeetcode");
        System.out.println(s);
    }
    }

