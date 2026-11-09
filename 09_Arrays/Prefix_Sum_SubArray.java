import java.util.Arrays;

public class Prefix_Sum_SubArray {
    public static void PrefixSumApproach(int arr[]) {
        int prefixArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                prefixArr[0] = arr[0];
            } else {
                prefixArr[i] = prefixArr[i - 1] + arr[i];
            }
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                sum = (i == 0) ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println(Arrays.toString(prefixArr));
        System.out.println(max);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12 };

        PrefixSumApproach(nums);
    }
}
