import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {
        // Reverse an Array

        int[] arr = {4, 89, 7, 9, 12,45};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int[] arr){

        int start = arr[0]; // first element
        int end = arr.length - 1; // last element

        while(start<end){

            swap(arr,start,end);
            start++;
            end--;
        }
    }

}
