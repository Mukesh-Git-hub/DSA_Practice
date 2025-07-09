package RecursionFolder;

public class PrintNumber {
    void fNumber(int i,int n){
        if(i>n){
            return ;

        }
        System.out.println(i);
        fNumber(i+1,n);
    }
}
