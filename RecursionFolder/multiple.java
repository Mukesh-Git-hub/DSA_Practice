package RecursionFolder;

public class multiple {
    int call(int n){
        if(n==0){
            return 1;
        }
        return n*call(n-1);
    }
}
