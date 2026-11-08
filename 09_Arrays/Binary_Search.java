public class Binary_Search {

    public static int BinarySearch(int arr[], int key){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = (s + e) / 2;

            if(arr[mid] > key){
                e = mid - 1;
            }else if(arr[mid] < key){
                s = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8 , 10, 12, 14, 16};
        int n = 20;

        System.out.println(BinarySearch(nums, n));
    }
}
