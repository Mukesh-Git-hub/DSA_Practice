package RecursionFolder;

public class Main {
    public static void main(String[] args) {
            //recursion basic
            //Sum of first numbers
            //Factorial of N
            //Power of two
int count=0;
      // f(count);
       int i=1;
       int n=4;
//       PrintnameNtimes  p=new PrintnameNtimes();
//       p.f(i,n);
//      PrintNumber pn=new PrintNumber();
//      pn.fNumber(1,5);
//      ReverseNumber r=new ReverseNumber();
//      r.fNumberreverse(10,1);
        LinearTrack L=new LinearTrack();
        L.f(8,8);
    }
   static void f(int count){
        if(count>3){
            return;
        }
       System.out.println(count);
        f(count+1);
   }

}
