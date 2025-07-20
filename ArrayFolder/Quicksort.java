package ArrayFolder;

public class Quicksort {

    public void quicksort(int[] array, int low, int high){
        if(low < high){
            int partitionIndex = partition(array, low, high);
            quicksort(array, low, partitionIndex - 1);
            quicksort(array, partitionIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;

        while(i < j){
            while(i <= high && array[i] <= pivot) i++;
            while(j >= low && array[j] > pivot) j--;

            if(i < j){
                swap(array, i, j);
            }
        }

        swap(array, low, j);
        return j;
    }

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
