    import java.util.Scanner;

    public class Factorial_func {
        public static int Factorial(int num){
            if ( num == 0 || num == 1 || num < 0){
                if (num < 0){
                    return -1;
                }
                return 1;
            }else{
                int fact = 1;
                while(num > 0){
                    fact *= num;
                    num -= 1;
                }
                return fact;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter number to find factorial:");
            int user_num = sc.nextInt();
            System.out.println("Factorial of " + user_num + " is: " + Factorial(user_num));

            sc.close();
        }
    }
