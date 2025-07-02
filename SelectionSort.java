class SelectionSort{
    public static void main(String[] args) {
        int []array = {5,4,3,2,1};
        int n=array.length;
         for(int i=0;i<=n-2;i++){
            int mini=i;
            for (int j = i; j <= n-1; j++) {
                if(array[j]<array[mini]){
                     mini=j;
                }
                int temp=array[i];
                array[i]=array[mini];
                array[mini]=temp;
            }
         }
         for(int each:array){
            System.out.print(each+" ");
         }
    }
}