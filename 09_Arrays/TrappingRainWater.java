import java.util.Arrays;

public class TrappingRainWater{

    public static int TrappedWater(int nums[]){
        int n = nums.length;

        int left_max[] = new int[n]; 

        int right_max[] = new int[n];

        left_max[0] = nums[0];
        right_max[n-1] = nums[n-1];

        for(int i = 1; i < n; i++){
            left_max[i] = Math.max(left_max[i-1], nums[i]);
        }

        for(int i = n-2; i >= 0; i--){
            right_max[i] = Math.max(right_max[i+1], nums[i]);
        }

        System.out.println(Arrays.toString(right_max));

        int total_wl = 0;

        for(int i = 0; i < n; i++){
            int wl = Math.min(right_max[i], left_max[i])- nums[i] ;

            if(wl > 0){
                total_wl += wl;
            }
            
        }

        return total_wl;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println(TrappedWater(height));
    }
}
