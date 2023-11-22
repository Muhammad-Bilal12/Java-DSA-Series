import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        How to take Input the array and print it.

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5]; // declare and initialized the array
//        using for loop to take input
//        for(int i = 0; i < arr.length ; i++){
//           arr[i] = in.nextInt();
//        }
//        using for loop to print the array
//        for(int i = 0; i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        // Enhanced for loop
//        for (int item : arr) { // for each loop
//            System.out.print(item + " ");
//        }

//        Easy method to print the array
//        System.out.println(Arrays.toString(arr));


        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
        // modify
        str[1] = "ahmed";
        System.out.println(Arrays.toString(str));

    }
}
