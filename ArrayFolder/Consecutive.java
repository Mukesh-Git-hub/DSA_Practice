package ArrayFolder;

public class Consecutive {

        public int findMaxConsecutiveOnes(int[] nums) {
            int n=nums.length;
            int count=0;
            int max=n;
            int result=0;
            for(int i=0;i<=n-1;i++){
                if(nums[i]==1){
                    count++;
                }
                else{
                    max=  count;
                    count=0;

                }
                 result=(max<count)?count:max;
            }
            return result;
        }
    }

