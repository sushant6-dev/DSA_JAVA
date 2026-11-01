import java.util.Scanner;

public class Functions_with_Parameters {
    public static int Calculate_Sum(int num1, int num2){ // Parameters or formal parameters
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter Number 1: ");
        int b = sc.nextInt();

        int sum = Calculate_Sum(a, b); // Arguements or actual parameters

        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
