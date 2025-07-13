package ArrayFolder;

public class Majorityn2 {
    public int majorityElement(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            count =0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}
