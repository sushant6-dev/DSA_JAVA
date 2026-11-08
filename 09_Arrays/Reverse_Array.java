import java.util.Arrays;

public class Reverse_Array {

    public static void ReverseArray(int arr[]){
        for(int i = 0, j = arr.length - 1; i <= arr.length / 2; i++){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12};
        ReverseArray(nums);
    }
}
