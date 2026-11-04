import java.util.Scanner;

public class IsEven {
    public static boolean IsNumEven(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num to check is even or not:");

        int x = sc.nextInt();

        if(IsNumEven(x)){
            System.out.println("Num " + x + " is an even number.");
        }else{
            System.out.println("Num " + x + " is not an even number.");
        }

        sc.close();
    }    
}
