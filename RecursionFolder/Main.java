package RecursionFolder;

public class Main {
    public static void main(String[] args) {
            //recursion basic
            //Sum of first numbers
            //Factorial of N
            //Power of two
int count=0;
       f(count);
    }
   static void f(int count){
        if(count>3){
            return;
        }
       System.out.println(count);
        f(count+1);
   }

}
