import java.util.*;

public class Insertion_Sort {
    public static void InsertionSort(int arr[]){
        for(int i = 1; i <= arr.length-1; i++){

            int prev = i - 1;
            int curr = arr[i];

            // arr[0] > arr[1] tab tak loop chalni chahiye
            // Piche ki taraf.
            while(prev >= 0 && arr[prev] > curr){
                // iska matlab arr[1] = 4, arr[0] = 5
                // arrr[1] = 5;
                arr[prev+1] = arr[prev];
                // Pura piche tak loop karna hai jabtak prev se chota na mile.
                // Or prev 0 se kam na ho jaaye.
                prev--;
            }
            // Iska matlab bachi jagah mei smallest number sorted part ka daal do
            arr[prev + 1] = curr;

        }
    }
    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};
        InsertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
