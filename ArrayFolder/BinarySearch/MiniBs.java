package ArrayFolder.BinarySearch;

public class MiniBs {
    int call(int[] array) {
        int ans = Integer.MAX_VALUE;
        int index = -1;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Handle duplicates
            if (array[low] == array[mid] && array[mid] == array[high]) {
                if (array[low] < ans) {
                    ans = array[low];
                    index = low;
                }
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if (array[low] <= array[mid]) {
                if (array[low] < ans) {
                    ans = array[low];
                    index = low;
                }
                low = mid + 1;
            }
            // Right half is sorted
            else {
                if (array[mid] < ans) {
                    ans = array[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }
}
