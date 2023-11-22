import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
//        Array List
//        ArrayList has no fixed Sized

        ArrayList<Integer> list = new ArrayList<>(10);
//        to add data
//        list.add(4);
//        list.add(10);
//        list.add(7);
//        list.add(10);

        // to print all the data
//        System.out.println(list);
//        some other functionality
//        System.out.println(list.contains(12));

//        to update the value
//        list.set(0,100);
//        System.out.println(list);
// delete element
//        list.remove(1);
//        System.out.println(list);


//        input
        Scanner in = new Scanner(System.in);
               for(int i = 0;i<5;i++){
                list.add(in.nextInt());
               }
        System.out.println(list);

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }


    }

}
