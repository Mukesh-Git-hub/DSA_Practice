package ArrayFolder;

public class firstandlastocc {
        public int[] searchRange(int[] array, int target) {
            int first=-1;
            int last = -1;
            for(int i=0;i<array.length;i++){
                if(array[i]==target && first == -1){
                    first=i;
                }
                else if(array[i] == target && first != -1 ){
                    last = i;
                }


            }
            if(last == -1){
                last = first;
            }
            return new int[]{first,last};
        }
    }

