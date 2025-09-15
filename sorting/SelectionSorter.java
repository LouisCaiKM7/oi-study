package sorting;

public class SelectionSorter{
    private final static SelectionSorter instance = new SelectionSorter();

    public SelectionSorter(){}

    public static SelectionSorter getInstance(){
        return instance;
    }

    public int[] sorting(int[] input){
        int[] result = input;
        int inLength = input.length;
        int min = input[0];
        int min_index = 0;
        int temp = 0;
        int holder = input[0];
        int temp_index = 0;
        int indexed = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] < 0){
                throw new IllegalArgumentException("Illegal input");
            }
        }
        for(int i = 0; i < input.length; i++){
            min = input[i];
            min_index = i;
            for(int k = 0 + indexed; k < input.length; k++){
                temp = input[k];
                temp_index = k;
                if(min > temp) {min = temp; min_index = temp_index;}
            }
            
            if(min_index == indexed){
                
            }
            else{
                holder = input[indexed];
                input[indexed] = input[min_index];
                input[min_index] = holder;
                
            }
            System.out.println("inLength" + inLength);
            System.out.println("min" + min);
            System.out.println("min_i" + min_index);
            System.out.println("t" + temp);
            System.out.println("t_i"+temp_index);
            System.out.println("holder"+holder);
            System.out.println("indexed"+indexed);
            indexed++;
        }
        return result;
    }
}