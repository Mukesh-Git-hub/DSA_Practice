package ArrayFolder;

import java.util.HashMap;

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
    public static int majority(int [] array){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=array.length;
        for(int num:array){
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num,count+1);
            }
            else{
                map.put(num,1);
            }
            if(map.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }

}
