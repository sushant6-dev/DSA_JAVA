public class Linear_Search {

    public static int LinearSearch(int arr[], int key){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num = 20;

        int nums[] = {5, 10, 15, 20, 25, 30};

        int index = LinearSearch(nums, num);

        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index: " + index);
        }
        System.out.println();
    }
}
