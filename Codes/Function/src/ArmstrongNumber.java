public class ArmstrongNumber {
    public static void main(String[] args) {

//        boolean isArmstrong = findArmstrong(153);
//        if (isArmstrong) {
//            System.out.println("Armstrong");
//        } else {
//            System.out.println("Not Armstrong");
//        }


//        3 digit Armstrong
        for (int i = 100; i < 1000; i++) {
            if (findArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean findArmstrong(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n /= 10;
        }
        return original == sum;
    }

}
