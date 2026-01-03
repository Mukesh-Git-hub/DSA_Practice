package array;

import java.util.*;

public class fourSum {
    public static void main(String[] args) {
       {
           int nums[]={-1,1,2,2,2};
int target = 5;
                List<List<Integer>> list = new ArrayList<List<Integer>>();
                for(int i=0;i<nums.length-4;i++){

                    for(int j=i+1;j<nums.length-3;j++){
                        for(int k=j+1;k<nums.length-2;k++){
                            for(int m=k+1;m<nums.length-1;m++){
                                if(nums[i]+nums[j]+nums[k]+nums[m]==target && i!=j&& j!=k&& k!=m){
                                    List<Integer> result = new ArrayList<>();



                                    result.add(i);
                                    result.add(j);
                                    result.add(k);
                                    result.add(m);
                                    list.add(result);
                                }
                            }
                        }
                    }
                }
           System.out.println(list);
            }
        }
    }
