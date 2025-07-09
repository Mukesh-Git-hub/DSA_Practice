package ArrayFolder;

public class Movetoend {
    void call(int []array){
        int count=0;
        int n=array.length;
        for(int i=0;i<=n-1;i++){
            if(array[i]==1){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            array[i]=1;
        }
        for(int i=count;i<=n-1;i++){
            array[i]=0;
        }
        for(int each:array){
            System.out.println(each+" ");
        }
    }
    void call2(int[]array){
        int count=0;
        int n=array.length;
        int []temp=new int[n];
        for(int i=0;i<=n-1;i++){
            if(array[i]>=1 && array[i]<=9){
                temp[count]=array[i];
            //   temp[i]=array[i];
                count++;
            }
        }
        for(int i=count;i<temp.length;i++){
            temp[i]=0;
        }
        for(int each:temp){
            System.out.println(each+" ");
        }

    }



}
