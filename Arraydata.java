public class Arraydata {
    public static void main(String[] args) {
        int []array={10,20,30,50,40};
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
        Arraysroted a = new Arraysroted();
        boolean some=a.call(array);
        System.out.println(some);
    }
}
