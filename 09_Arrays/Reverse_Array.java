import java.util.Arrays;

public class Reverse_Array {

    public static void ReverseArray(int arr[]){
        int s = 0;
        int e = arr.length - 1;
        while (s < e){

            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10, 12};
        ReverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
