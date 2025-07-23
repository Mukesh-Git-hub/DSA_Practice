package ArrayFolder;

public class Arraydata {
    public static void main(String[] args) {

        int [] searcharray={6,5,4,3,2,1};
        //---------------bubble sort
//         ArrayFolder.Bubblesort sort=new ArrayFolder.Bubblesort();
//         sort.callsort(array);
           //-----------Insertion sort
//         ArrayFolder.Insertionsort insertionsort=new ArrayFolder.Insertionsort();
//         insertionsort.callsort(array);
        //-----------Merge sort
//         ArrayFolder.Mergesort m=new ArrayFolder.Mergesort();
//         m.callsort(array);
        //------------Largestvalue
//         ArrayFolder.Largestvalue l=new ArrayFolder.Largestvalue();
//         l.call(array);
        //--------------secondlarge
//        ArrayFolder.Secondlarge s= new ArrayFolder.Secondlarge();
//        s.method1(array);
        //----------missingnumber
//        ArrayFolder.missingnumber m=new ArrayFolder.missingnumber();
//       int n=m.missingNumber(array);
//        System.out.println(n);
        //-----------Arraysorted
//        ArrayFolder.Arraysroted a = new ArrayFolder.Arraysroted();
//        boolean some=a.call(array);
//        System.out.println(some);
        //----------RotatedOneplace
//        ArrayFolder.RotatedOnePlace r=new ArrayFolder.RotatedOnePlace();
//        r.call(array,3);
        //----------One to End
//        ArrayFolder.Movetoend m=new ArrayFolder.Movetoend();
//      m.call2(array);
        //----------union
//        ArrayFolder.Union u =new ArrayFolder.Union();
//        u.call(array,array2);
        //------------consecutive
//        ArrayFolder.Consecutive c =new ArrayFolder.Consecutive();
//        System.out.println(c.findMaxConsecutiveOnes(array));
        //-------------Two sum
//        ArrayFolder.TwoSum two=new ArrayFolder.TwoSum();
//        two.twoSum(array,3);
// //-------------Max sub array
//        ArrayFolder.MaxSubArray m=new ArrayFolder.MaxSubArray();
//        System.out.println(m.maxSubArray(array));
        //-------------Longest sub array
//        LongestSubArrayWithK k=new LongestSubArrayWithK();
//        System.out.println( k.call());
        //-------------Sorted012
//        Sorted012 s=new Sorted012();
//        s.call(array0);
        //-------------SearchInsertposition
//        SearchInsertPosition s= new SearchInsertPosition();
//       int result= s.call(searcharray,9);
       // System.out.println(result);
//        Bubblesort b = new Bubblesort();
//        b.recursionBubbleSort(searcharray, searcharray.length);
        Insertionsort I= new Insertionsort();
        I.recursionInsertionSort(searcharray,1);
        for (int num : searcharray) {
            System.out.print(num + " ");
        }
    }
}
