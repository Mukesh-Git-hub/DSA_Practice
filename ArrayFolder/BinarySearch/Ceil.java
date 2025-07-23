package ArrayFolder.BinarySearch;

public class Ceil {
    int call(int[] array,int x){
        int ans= -1;
        int low=0;
        int high= array.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]>=x){//30>=40
                ans=mid;
              high=mid-1;
            }
            else{

                low=mid+1;
            }
        }
        return array[ans] ;
    }
}
