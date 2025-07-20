package Stringfolder;

import ArrayFolder.Quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[]={4,3,5,2,1,7,8,9,6};

        Quicksort q = new Quicksort();
        q.quicksort(array,0, array.length-1);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
