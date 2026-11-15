public class Bubble_Sort{
    public static void BubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int swap = 0;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                System.out.println("Array Already Sorted.");
                break;
            }
        }
    }
    public static void PrintArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 3, 5};

        BubbleSort(nums);
        PrintArray(nums);

    }
}
