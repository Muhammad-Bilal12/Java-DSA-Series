public class FindMax {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89, 89, 23};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }

//  Find range
static int maxRange(int[] arr,int start,int end) {
    int max = arr[start];

// eXECPTION cASE
    if (start > end) {
        return -1;
    }

    if (arr == null) {
        return -1;
    }

    for (int i = start; i < end; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

    static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
