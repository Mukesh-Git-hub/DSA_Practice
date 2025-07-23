package ArrayFolder;

public class Bubblesort {
    int[] callsort(int[] array){
        int n= array.length;;
        for(int i=0;i<=n-2;i++){
            for(int j=1;j<=n-1;j++){
                if(array[j-1]>array[j]){
                    swap.s(array,j-1,j);
                }
            }
        }
        for(int each:array){
            System.out.println(each+" ");
        }
        return array;
    }
    void recursionBubbleSort(int [] array,int n){
        if( n == 1)return ;
        for(int i=0;i<n-1;i++){
            if(array[i]>array[i+1]){
                int temp= array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
            }
        }
        recursionBubbleSort(array,n-1);

    }

}
