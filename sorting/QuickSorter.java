package sorting;

public class QuickSorter {
    private final static QuickSorter instance = new QuickSorter();

    private QuickSorter() {} // private constructor for singleton

    public static QuickSorter getInstance() {
        return instance;
    }

    public int[] sorting(int[] input) {
        // make a copy so original array is not modified
        int[] result = input.clone();
        quicksort(result, 0, result.length - 1);
        return result;
    }

    private void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;       // index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
