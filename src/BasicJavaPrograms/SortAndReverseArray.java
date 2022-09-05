package BasicJavaPrograms;

import java.util.Arrays;

public class SortAndReverseArray {
    public static void main(String[] args) {
        int[] arr = {50,20,40,30,10};
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        System.out.print("Sorted String : " + Arrays.toString(sorted));
        for (int i = sorted.length-1; i>=0; i--){
            System.out.print(sorted[i] + " ");
        }
    }
} 
