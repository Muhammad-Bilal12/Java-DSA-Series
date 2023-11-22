import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 9, 3};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
