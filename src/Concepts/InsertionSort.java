package Concepts;

public class InsertionSort {
    public static void main(String args[]) {
        int[] arr = {24, 12, 1, 3, 4};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
