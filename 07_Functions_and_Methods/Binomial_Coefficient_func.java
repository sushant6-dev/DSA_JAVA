import java.util.Scanner;

public class Binomial_Coefficient_func {
    public static int Factorial(int num) {
        int f = 1;

        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static double Binomial_Coefficient(int num, int r_value){
        int n_fact = Factorial(num);
        int r_fact = Factorial(r_value);

        int n_r_fact = Factorial(num - r_value);

        double binomial = n_fact / (r_fact * n_r_fact);
        return binomial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to calculate Binomial Co-efficient:");
        int user_num = sc.nextInt();
        System.out.println("Enter R value to calculate Binomial Co-efficient:");
        int user_r = sc.nextInt();

        double bino = Binomial_Coefficient(user_num, user_r);

        System.out.println("Binomial Distribution for n: " + user_num + " and r: " + user_r + " is " + bino);

        sc.close();

    }
}
