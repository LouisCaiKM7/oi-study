package sorting;

public class BucketSorter {
    private final static BucketSorter instance = new BucketSorter();

    private BucketSorter() {} // private constructor for singleton

    public static BucketSorter getInstance() {
        return instance;
    }

    public int[] sorting(int[] input) {
        int[] result = new int[input.length];
        int max = input[0];
        int min = input[0];

        // find min and max
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) max = input[i];
            if (input[i] < min) min = input[i];
        }

        int bucket_size = (max - min) / input.length + 1;
        int bucket_count = (max - min) / bucket_size + 1;

        // buckets and sizes
        int[][] buckets = new int[bucket_count][input.length]; // big enough for worst case
        int[] bucket_sizes = new int[bucket_count]; // track how many elements each bucket has

        // distribute input into buckets
        for (int num : input) {
            int bucketIndex = (num - min) / bucket_size;
            buckets[bucketIndex][bucket_sizes[bucketIndex]++] = num;
        }

        // merge sorted buckets
        int index = 0; // global index for result
        for (int i = 0; i < bucket_count; i++) {
            if (bucket_sizes[i] > 0) {
                int[] actualBucket = new int[bucket_sizes[i]];
                System.arraycopy(buckets[i], 0, actualBucket, 0, bucket_sizes[i]);

                int[] sorted_bucket = InsertionSorter.getInstance().sorting(actualBucket);
                for (int num : sorted_bucket) {
                    result[index++] = num;
                }
            }
        }

        return result;
    }
}
