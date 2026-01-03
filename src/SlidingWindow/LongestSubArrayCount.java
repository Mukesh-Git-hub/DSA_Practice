package SlidingWindow;

public class LongestSubArrayCount {
    public static void main(String[] args) {
        int []array={1,2,1,1,2};
        int k=6,maxi=0;
        for(int i=0;i< array.length;i++){
            int sum=0;
            for(int j=i;j< array.length;j++){
                sum+=array[j];
                if(sum<=k){
                    maxi=Math.max(maxi,j-i+1);
                }
            }
        }

        System.out.println(betterSolution(array,14));
    }
     static  int  betterSolution(int []array,int k){
        int left=0,sum=0,count=0,maxi=0,right=0;
        while(right<array.length-1){
            sum+=array[right];
            if(sum<=k){
                right++;
                sum+=array[right];
                count++;
            }
            else if(sum>k){
                sum-=array[left];
                left--;
                count--;
            }
            maxi=Math.max(count,maxi);
        }
        return maxi;
    }
}
