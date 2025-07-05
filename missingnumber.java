public class missingnumber {

        public int missingNumber(int[] nums) {
            int max=findmax(nums);
            int min=findmin(nums);
            System.out.println(max);
            System.out.println(min);
            int sum=0;
            for(int i=min;i<=max;i++){
                sum+=i;
            }
            int sumofarray=0;
            for(int i=0;i<nums.length;i++){
                sumofarray+=  nums[i];
            }
            int result=sum-sumofarray;
            return result ;
        }
        static int findmax(int[]array){
            int maxvalue=Integer.MIN_VALUE;
            for(int i=0;i<array.length;i++){
                if(array[i]>maxvalue){
                    maxvalue=array[i];
                }
            }
            return maxvalue;
        }
        static int findmin(int[]array){
            int minvalue=Integer.MAX_VALUE;
            for(int i=0;i<array.length;i++){
                if(array[i]<minvalue){
                    minvalue=array[i];
                }
            }
            return minvalue;
        }

}
