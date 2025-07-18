package ArrayFolder.Matrix;

public class Main {
    public static void main(String[] args) {
        int array[][] = {
                {
                    1,2,3
                },
                {
                    4,5,6
                },
                {
                    7,8,9
                }
        };
   Rotate90 r=new Rotate90();
   r.call(array);
    }
}
