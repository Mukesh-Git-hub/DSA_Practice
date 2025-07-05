public class Secondlarge {

    void method1(int[] array) {
        int n = array.length;




        // Traverse from second last to find the second largest distinct element
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] != array[n - 1]) {
                System.out.println("Second Largest: " + array[i]);
                return;
            }
        }

        // If all elements are the same
        System.out.println("No second largest element found.");
    }

    // Swap helper method
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test

}
