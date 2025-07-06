public class RotatedOnePlace {
  void call(int[] array){
      int n= array.length;
      int temp=array[0];
      for(int i=0;i<=n-2;i++){
          array[i]=array[i+1];

      }
      array[n-1]=temp;
      for(int each:array){
          System.out.println(each+" ");
      }
  }
   void call(int[]array,int k){
      int n=array.length;
      int d=k%n;
      //find the how many rotation
       int [] temp = new int[d];
       for(int i=0;i<d;i++){
           temp[i]=array[i];
       }
       for(int i=d;i<=n-1;i++){
          array[i-d]= array[i];
       }
       int j=0;
       for(int i=n-d;i<=n-1;i++){
           array[i]=temp[j++];
       }

       for(int each:array){
           System.out.print(each+" ");
       }
   }



}
