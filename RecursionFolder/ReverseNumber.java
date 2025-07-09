package RecursionFolder;

public class ReverseNumber {
    void fNumberreverse(int N,int i){
        if(N<i){
            return ;
        }

        fNumberreverse(N-1,i);
        System.out.println(N);
    }

}
