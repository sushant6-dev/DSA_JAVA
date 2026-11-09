public class Sum_SubArray {
    public static void SumSubArray(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];

                    if (sum > max) {
                        max = sum;
                    }
                    if (sum < min) {
                        min = sum;
                    }
                }
                System.out.print(" = " + sum);
                System.out.println();
                
            }
            
        }
        System.out.println("Max Sum " + max);
        System.out.println("Min Sum " + min);
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12};

        SumSubArray(nums);
    }
}
