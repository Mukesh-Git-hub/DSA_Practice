package ArrayFolder.Matrix;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]array=new int[3][3];
        //           1 2 3
         //          4 5 6
        //           7 8 9
         for(int i=0;i<array.length;i++){
             for(int j=0;j<array[i].length;j++){
                 array[i][j]=sc.nextInt();
                         }

         }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
             System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");

        }

    }
}
