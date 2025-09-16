package sorting;

public class BubbleSorter {
    private final static BubbleSorter instance = new BubbleSorter();
    public BubbleSorter(){}

    public static BubbleSorter getInstance(){
        return instance;
    }
    
    public int[] sorting(int[] input){
        int[] result = input;
        int first = input[0];
        int second = input[1];
        int indexed = 0;
        for(int j = 0; j < input.length; j++){
            for (int i = 0; i < result.length-indexed; i++) {
                first = result[i];
                if (i+1 <= result.length-1) {
                    second = result[i+1];
                }
                else{
                    second = result[i];
                }
                if(first > second){
                    result[i] = second;
                    result[i+1] = first;
                }
            }
            indexed ++;
        }
        return result;
    }
}
