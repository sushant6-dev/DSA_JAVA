public class Stock_Max_Profit {
    public static int BestTime(int prices[]){
        int n = prices.length;

        int left_min[] = new int[n];
        int right_max[] = new int[n];

        left_min[0] = prices[0];
        right_max[n-1] = prices[n-1];


        for(int i = 1; i < n; i++){
            left_min[i] = Math.min(prices[i], left_min[i-1]);
        }

        for(int i = n-2; i >= 0; i--){
            right_max[i] = Math.max(prices[i], right_max[i+1]);
        }
        int max_profit = 0;

        for(int i = 0; i < n; i++){
            max_profit = Math.max(max_profit, right_max[i] - left_min[i]);
        }


        return max_profit;
    }
    public static void main(String[] args) {

        int nums[] = {7,1,5,3,6,4};

        System.out.println(BestTime(nums));
    }
}
