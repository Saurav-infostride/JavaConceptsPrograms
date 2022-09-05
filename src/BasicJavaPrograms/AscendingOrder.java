package BasicJavaPrograms;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 40};
        int temp;
        int min = arr[0];
        System.out.println("Original Array");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
            for (int j = i + 1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array sorted");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest num in array : " + min);
    }
}
