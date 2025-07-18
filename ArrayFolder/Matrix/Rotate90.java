package ArrayFolder.Matrix;

public class Rotate90 {
    void call(int [][] array){
        int temp[][]=new int[array.length][array.length];
        int n= temp.length;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<array[i].length;j++){
//                temp[j][(n-1)-i]=array[i][j];
//            }
//        }
        for(int i=0;i<n;i++){
            for(int j=0;j<array[i].length;j++){
                temp[j][i]=array[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=array[i].length-1;j>=0;j--){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
