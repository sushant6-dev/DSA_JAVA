public class Search_In_Rotated {
    

    public static int SearchRotArr(int nums[], int x) {
        int n = nums.length;

        int s = 0;
        int e = n - 1;

        while(s <= e){
            int mid = (s + e) / 2;

            if(nums[mid] == x){
                return mid;
            }
            else if(nums[mid] > x && x >= nums[s]){
                if(nums[s] == x){
                    return s;
                }
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        
        return -1;

    }

    public static void main(String[] args) {
        int rot_arr[] = {4, 5, 6, 7, 8, 0, 1, 2};
        int target = 6; 

        System.out.println(SearchRotArr(rot_arr, target));
    }
}
