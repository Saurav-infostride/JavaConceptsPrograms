package Concepts;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr1 = {12,9,32,45,65,76};
        int i, j, temp;
        int n = arr1.length;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr1[j] < arr1[i]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
            System.out.print(arr1[i]+" " );
        }
    }
}
