import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
//        Passing Function
        int[] nums = {23,56,75,712,73};

        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static  void change(int[] a){
        a[0] = 232;
    }
}
