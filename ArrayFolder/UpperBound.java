package ArrayFolder;

public class UpperBound {
    public int call(int[] array, int low, int high, int x){
        int ans= array.length;
        while(low<=high) {
            int mid= (low+high)/2;
            if(array[mid] > x){
                ans=mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
