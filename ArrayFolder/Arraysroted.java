package ArrayFolder;

public class Arraysroted
{
    boolean call(int []array){
        int n= array.length;
        for(int i=0;i<=n-2;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }


}
