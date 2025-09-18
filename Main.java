import java.util.Arrays;

import sorting.BubbleSorter;
import sorting.BucketSorter;
import sorting.SelectionSorter;
import sorting.InsertionSorter;  // <-- add this

public final class Main {
    private Main() {}

    public static void main(String... args) {
        int[] sorted = SelectionSorter.getInstance().sorting(new int[]{5,4,2,1,1,3});
        int[] sorted2 = BubbleSorter.getInstance().sorting(new int[]{6,5,4,3,2,1,1});
        int[] sorted3 = InsertionSorter.getInstance().sorting(new int[]{6,5,3,4,2,1,1});
        int[] sorted4 = BucketSorter.getInstance().sorting(new int[]{5,4,2,1,1,3});
        System.out.println(Arrays.toString(sorted4));
    }
}
