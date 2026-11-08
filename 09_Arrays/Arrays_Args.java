public class Arrays_Args {
    public static void UpdateArray(int arr[], int x){
        x  = 20;
        for(int i = 0; i < arr.length; i++){
            arr[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {95, 87, 99};

        int n = 5;
        
        // Java uses pass by reference for Arrays.
        // Reference to original array location is shared to function.

        // Java uses pass by value for Variables.
        // Copy of original variable is passed to the function.

        UpdateArray(marks, n);

        System.out.println(n);

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] +" ");
        }

        System.out.println();

    }
}
