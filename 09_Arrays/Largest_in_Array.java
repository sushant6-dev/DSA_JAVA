public class Largest_in_Array {

    public static int LargestValue(int arr[]){
        int lar = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(lar < arr[i]){
                lar = arr[i];
            }
        }

        return lar;
    }
    public static void main(String[] args) {
        int nums[] = {1,2, 6, 3, 5};

        System.out.println("Largest value in array is: " + LargestValue(nums));
    }
}
