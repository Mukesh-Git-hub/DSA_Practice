package ArrayFolder.BinarySearch;

import static java.lang.Math.min;

public class MiniBs {
    int call(int []array){
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high= array.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (array[low] == array[mid] && array[mid] == array[high]) {

                low++;
                high--;
            }

            if(array[low]<=array[high]){
                ans=min(ans,array[low]);
                break;
            }
            if(array[low]<=array[mid]){
                ans=min(ans,array[low]);

                low=mid+1;
            }
            else{  ans=min(ans,array[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
