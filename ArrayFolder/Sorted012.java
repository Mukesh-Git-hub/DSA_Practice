package ArrayFolder;

public class Sorted012
{
    void call(int[] array){
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i< array.length;i++){
            if(array[i] == 0){
                count0++;
            }
            else if(array[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int temp[]=new int[array.length];
        for(int i=0;i<count0;i++){
            temp[i]=0;
        }
        for(int i=count0;i<(count0+count1);i++){
            temp[i]=1;
        } for(int i=(count1+count0);i< temp.length;i++){
            temp[i]=2;
        }
        for(int each:temp){
            System.out.println(each+" ");
        }
    }
}
