package ArrayFolder;

public class Largestvalue {
    void call(int[] array){
        int n= array.length-1;
        int max=Integer.MIN_VALUE;//some small value if some thing is greater this in array make those as max
        for(int i=0;i<=n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }

}
