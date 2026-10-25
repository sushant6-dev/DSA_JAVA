import java.util.*;

public class Average3Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3");
        int num3 = sc.nextInt();

        float avg = ((num1 + num2 + num3) / 3);

        System.out.println(avg);

        sc.close();
    }
}
