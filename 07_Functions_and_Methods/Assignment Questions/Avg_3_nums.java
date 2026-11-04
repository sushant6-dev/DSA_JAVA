import java.util.Scanner;

public class Avg_3_nums {
    public static double AvgofNums(int a, int b, int c){

        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num:");
        int x = sc.nextInt();

        System.out.println("Enter second num:");
        int y = sc.nextInt();

        System.out.println("Enter third num:");
        int z = sc.nextInt();

        System.out.println(AvgofNums(x, y, z));

        sc.close();
    }    
}
