public class Removedup {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4};
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[index]) {
                index++;
                array[index] = array[i];
            }
        }

        // Print unique elements only
        for (int i = 0; i <= index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
