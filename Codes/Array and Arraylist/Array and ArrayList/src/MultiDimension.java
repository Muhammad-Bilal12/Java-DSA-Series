import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

//        Multi Dimensional Array
//        Combination of Multiple Rows and Columns
        /*
         * 2 3 4
         * 1 2 3
         * 4 5 6
         * */

//        Create 2d array in Java
//        Syntax
        // int[row][col] name = new int[size of rows][] -> columns size is optional
//        int[][] array2D = {
//                {1, 2, 3}, // 0th index
//                {4, 5, 6}, // 1st index
//                {7, 8, 9} //2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr2d = new int[3][3];
        Scanner in = new Scanner(System.in);

        // Input

        for (int rows = 0; rows < arr2d.length; rows++) {
            for (int col = 0; col < arr2d[rows].length; col++) {
//                arr2d[rows] = length of first array of the main array
                arr2d[rows][col] = in.nextInt();
            }
        }

        // Output
//        for (int rows = 0; rows < arr2d.length; rows++) {
//            for (int col = 0; col < arr2d[rows].length; col++) {
////                System.out.print(Arrays.toString(arr2d[rows]));
//                System.out.print(arr2d[rows][col] + " ");
//            }
//            System.out.println();
//        }
//        for(int rows = 0; rows < arr2d.length; rows++) {
//            System.out.println(Arrays.toString(arr2d[rows]));
//        }

//        enhanced loops
        for (int[] row : arr2d) {
            System.out.println(Arrays.toString(row));
        }
    }
}
