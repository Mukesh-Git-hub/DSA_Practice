package Queueandstack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class firstproblem {
    public static void main(String[] args) {
        int []arr={2,3,4,7,11};
        int k=5;
                int number=1;
                int n=arr.length;
                int temp[]=new int[n+k];
                int i=0;
                int c=0;
                while(i<(n)){
                    if(arr[i]!=number){
                        temp[c]=number;
                        number++;
                        c++;
                    }
                    else{
                        number++;
                        i++;
                    }
                }
                while(c<(n+k)){
                    temp[c]=number++;
                    c++;
                }
        for(int t:temp){
            System.out.print(t+" ");
        }
        System.out.println("missing:" +temp[k-1]);

}}
