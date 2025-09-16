package sorting;

import java.util.Arrays;

public class InsertionSorter {
    private final static InsertionSorter instance = new InsertionSorter();

    private InsertionSorter() {} // private constructor for singleton

    public static InsertionSorter getInstance() {
        return instance;
    }

    public int[] sorting(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);

        for (int i = 1; i < result.length; i++) {
            int key = result[i];
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && result[j] > key) {
                result[j + 1] = result[j];
                j--;
            }
            result[j + 1] = key;
        }

        return result;
    }

}
