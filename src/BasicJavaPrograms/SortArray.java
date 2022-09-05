package BasicJavaPrograms;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int sortArr[] = {30,20,40,10,50};
        Arrays.sort(sortArr);
        System.out.print(Arrays.toString(sortArr));
    }
}
