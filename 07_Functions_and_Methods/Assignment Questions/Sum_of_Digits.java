import java.util.Scanner;

public class Sum_of_Digits {

    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to get sum of digits.");
        int user_num = sc.nextInt();

        while(user_num > 0){
            sum += (user_num % 10);
            user_num = user_num / 10;
        }
        System.out.println(sum);
        sc.close();
    }    
}
