package RecursionFolder;

public class Power {
    int call(int i,int n){
        if(i==0) return 1;
        return n*call(i-1,n);

    }
}
