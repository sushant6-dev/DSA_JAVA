public class KadanesAlgo{
    public static int MaxSubArrayKadane(int arr[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE; 
        for(int i = 0; i < arr.length; i++){
            curr_sum += arr[i];

            if(curr_sum > max_sum){
                max_sum = curr_sum;
            }

            if(curr_sum < 0){
                curr_sum = 0;
            }
            
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println(MaxSubArrayKadane(nums));
    }
}
