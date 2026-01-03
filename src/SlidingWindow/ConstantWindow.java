package SlidingWindow;

public class ConstantWindow {
    public static void main(String[] args) {
        int []array={-1,2,3,3,4,5,-1};
        int left=0;
        int k=4;
        int maxi=0,sum=0;
        int n= array.length;
      int right= 0;
      while(right<n){
         sum+=array[right];
         if(right-left+1==k){
             maxi=Math.max(maxi,sum);
             sum-=array[left];
             left++;
         }
        right++;
      }
       int result =slidingwindow1(array);
        System.out.println(result+" this is result");
    }
    static int slidingwindow1(int[] array){
        int left =0;
        int constant=4;
        int sum=0;
        int maxi=0;
        int right=left+constant;
        while(right< array.length-1){
            sum=0;
            for (int i=left;i<right;i++){
                sum+=array[i];
            }

            maxi=Math.max(sum,maxi);
            sum-=array[left];
            left++;
            right++;
            sum+=array[right];
        }
        return maxi;
    }
}
