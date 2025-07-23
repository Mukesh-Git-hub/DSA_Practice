package ArrayFolder.BinarySearch;

public class firstAndLastOccurence {

    static int firstmethod(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == x) {
                ans = mid;
                high = mid - 1; // Move left to find earlier occurrence
            } else if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int lastmethod(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == x) {
                ans = mid;
                low = mid + 1; // Move right to find later occurrence
            } else if (array[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public int[] callMethod(int[] array) {
        int first = firstmethod(array, 8);
        int last = lastmethod(array, 8);
        System.out.println("Method");
        return new int[]{first, last};
    }
}
