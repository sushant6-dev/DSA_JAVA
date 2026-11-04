import java.util.Scanner;

public class IsPalindrome {

    public static int RevNum(int num){
        int rev_num = 0;

        while(num > 0){
            int dig = num % 10;

            rev_num = rev_num * 10 + dig;

            num = num / 10;
        }
        return rev_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if number is Palindrome or not.");

        int user_num = sc.nextInt();
        int rev_num = RevNum(user_num);
        boolean is_palindrome = true;

        while(user_num > 0){
            int user_dig = user_num % 10;
            int rev_dig = rev_num % 10;

            if(user_dig != rev_dig){
                is_palindrome = false;
                break;
            }
            user_num = user_dig / 10;
            rev_num = rev_dig / 10;
        }
        System.out.println(is_palindrome);
        sc.close();
    }    
}
