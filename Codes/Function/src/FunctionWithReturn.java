import java.util.Scanner;

public class FunctionWithReturn {
    public static void main(String[] args) {

        int s1 = sum();
        int s2 = sum();

        System.out.println(s1);
        System.out.println(s2);
    }

    static int sum (){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = n1+n2;
        return sum;

    }

}
