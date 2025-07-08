public class LinearSearch {
    int call(int[] array,int target){
        int index=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                index=i;
            }
        }
        return index;
    }

}
