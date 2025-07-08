public class Arraydata {
    public static void main(String[] args) {
        int []array={1,1,0,1,1,1,0,1};
        int []array2={1,2,0,4};
//         Bubblesort sort=new Bubblesort();
//         sort.callsort(array);
//         Insertionsort insertionsort=new Insertionsort();
//         insertionsort.callsort(array);
//         Mergesort m=new Mergesort();
//         m.callsort(array);
//         Largestvalue l=new Largestvalue();
//         l.call(array);
//        Secondlarge s= new Secondlarge();
//        s.method1(array);
//        missingnumber m=new missingnumber();
//       int n=m.missingNumber(array);
//        System.out.println(n);
//        Arraysroted a = new Arraysroted();
//        boolean some=a.call(array);
//        System.out.println(some);
//        RotatedOnePlace r=new RotatedOnePlace();
//        r.call(array,3);
//        Movetoend m=new Movetoend();
//
////        m.call2(array);
//        Union u =new Union();
//        u.call(array,array2);
//        Consecutive c =new Consecutive();
//        System.out.println(c.findMaxConsecutiveOnes(array));
        TwoSum two=new TwoSum();
        two.twoSum(array,3);

        MaxSubArray m=new MaxSubArray();
        System.out.println(m.maxSubArray(array));
    }
}
