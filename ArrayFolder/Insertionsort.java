package ArrayFolder;

public class Insertionsort {
    void callsort(int []array){
        int n= array.length;
        for(int i=0;i<=n-2;i++){
           for(int j=i;j>=0;j--){
               if(array[j+1]<array[j]){
                   swap.s(array,j+1,j);
               }
        }
    }
        for(int each:array){
            System.out.println(each+" ");
        }

}
void recursionInsertionSort(int[] array,int i){
        int n= array.length;
        if(i==n) return;
        for(int j=i;j>0;j--){
            if(array[j-1]>array[j]){
                int temp= array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
            }
        }
        recursionInsertionSort(array,i+1);
}
}
