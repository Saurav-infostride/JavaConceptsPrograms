package BasicJavaPrograms;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
//        int arr3 = parseInt(Arrays.toString(arr));
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
