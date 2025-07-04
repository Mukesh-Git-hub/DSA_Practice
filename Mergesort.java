public class Mergesort {
    void callsort(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        ms(arr, low, high);
        for(int each : arr){
            System.out.println(each + " ");
        }
    }

    public static void ms(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid + 1, high);
        merging(arr, low, mid, high);
    }

    public static void merging(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while(left <= mid){
            temp[k++] = arr[left++];
        }

        while(right <= high){
            temp[k++] = arr[right++];
        }


        for(int i = 0; i < temp.length; i++){
            arr[low + i] = temp[i];
        }
    }


    public static void main(String[] args) {
        Mergesort ms = new Mergesort();
        int[] arr = {5, 3, 8, 1, 2, 7};
        ms.callsort(arr);
    }
}
