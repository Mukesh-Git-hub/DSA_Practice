package ArrayFolder;

public class Arraydata {
    public static void main(String[] args) {
        int []array={1,1,0,1,1,1,0,1};
        int []array2={1,2,0,4};
        int []array0={2,0,2,1,1,0};
        int [] searcharray={1,3,4,5,6};
//         ArrayFolder.Bubblesort sort=new ArrayFolder.Bubblesort();
//         sort.callsort(array);
//         ArrayFolder.Insertionsort insertionsort=new ArrayFolder.Insertionsort();
//         insertionsort.callsort(array);
//         ArrayFolder.Mergesort m=new ArrayFolder.Mergesort();
//         m.callsort(array);
//         ArrayFolder.Largestvalue l=new ArrayFolder.Largestvalue();
//         l.call(array);
//        ArrayFolder.Secondlarge s= new ArrayFolder.Secondlarge();
//        s.method1(array);
//        ArrayFolder.missingnumber m=new ArrayFolder.missingnumber();
//       int n=m.missingNumber(array);
//        System.out.println(n);
//        ArrayFolder.Arraysroted a = new ArrayFolder.Arraysroted();
//        boolean some=a.call(array);
//        System.out.println(some);
//        ArrayFolder.RotatedOnePlace r=new ArrayFolder.RotatedOnePlace();
//        r.call(array,3);
//        ArrayFolder.Movetoend m=new ArrayFolder.Movetoend();
//
////        m.call2(array);
//        ArrayFolder.Union u =new ArrayFolder.Union();
//        u.call(array,array2);
//        ArrayFolder.Consecutive c =new ArrayFolder.Consecutive();
//        System.out.println(c.findMaxConsecutiveOnes(array));
//        ArrayFolder.TwoSum two=new ArrayFolder.TwoSum();
//        two.twoSum(array,3);
//
//        ArrayFolder.MaxSubArray m=new ArrayFolder.MaxSubArray();
//        System.out.println(m.maxSubArray(array));
//        LongestSubArrayWithK k=new LongestSubArrayWithK();
//        System.out.println( k.call());
//        Sorted012 s=new Sorted012();
//        s.call(array0);
        SearchInsertPosition s= new SearchInsertPosition();
       int result= s.call(searcharray,9);
        System.out.println("program start");
        System.out.println(result);
    }
}
