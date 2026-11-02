    import java.util.Scanner;

    public class Factorial_func {
        public static int Factorial(int num){
            int f = 1;

            for(int i = 1; i <= num; i++){
                f *= i;
            }
            return f;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter number to find factorial:");
            int user_num = sc.nextInt();
            System.out.println("Factorial of " + user_num + " is: " + Factorial(user_num));

            sc.close();
        }
    }
