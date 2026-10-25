import java.util.Scanner;

public class CalculateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of pen");
        int pen_price = sc.nextInt();

        System.out.println("Enter the price of pencil");
        int pencil_price = sc.nextInt();

        System.out.println("Enter the price of eraser");
        int eraser_price = sc.nextInt();

        int total = pen_price + pencil_price + eraser_price;

        float total_bill = (float) (total + (total * 0.18));

        System.out.println("Your total bill is: " + total_bill);

        sc.close();
    }
}
