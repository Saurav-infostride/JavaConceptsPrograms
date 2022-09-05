package Concepts;

public class BinarySearch {
    int  binarySearchNumber(int array [], int x, int low, int high){
        if (high >= low){
            int mid = low + (low + high)/2;

            if (array [mid] == x )
                return mid;

            if (array [mid] > x)
                return binarySearchNumber(array, x, low, mid - 1);

            return binarySearchNumber(array, x, mid + 1, high);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int array[] = { 2,4 ,5,6,7,8,9};
        int x = 4;
        int n = array.length;
        int result = ob.binarySearchNumber(array, x, 0, n-1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
