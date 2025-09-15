import java.util.Arrays;
import sorting.SelectionSorter;  // <-- add this

public final class Main {
    private Main() {}

    public static void main(String... args) {
        int[] sorted = SelectionSorter.getInstance().sorting(new int[]{5,4,2,1,1,3});
        System.out.println(Arrays.toString(sorted));
    }
}
