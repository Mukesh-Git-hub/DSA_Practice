package ArrayFolder.BinarySearch;

public class Floor {
    int call(int[] array,int x){
        int ans= -1;
        int low=0;
        int high= array.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]<=x){
               ans=mid;
              high= mid-1;
            }
            else{
              low=mid+1;
            }
        }
        return array[ans];
    }
}
