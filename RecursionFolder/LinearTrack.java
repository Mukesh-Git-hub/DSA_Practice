package RecursionFolder;

public class LinearTrack {
    void f(int i,int n){
        if(i==0){
            return ;
        }
        f(i-1,n);
        System.out.println(i);
    }

}
