import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mulList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // initialisation for creating rows
        for (int i = 0; i < 3; i++) {
            mulList.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mulList.get(i).add(in.nextInt());
            }
        }

        System.out.println(mulList);


    }
}
