import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        System.out.println("Define Operation to perform");
        char ch = sc.next().charAt(0);

        double res = 0;

        switch (ch) {
            case '+':{
                res = num1 + num2;
                break;
            }
            case '-':{
                res = num1 - num2;
                break;
            }
            case '*':{
                res = num1 * num2;
                break;
            }
            case '/':{
                res = num1 / num2;
                break;
            }
            case '%':{
                res = num1 % num2;
                break;
            }
        
            default: 
            {
                System.out.println("Invalid Input");
            }
            
        }

        System.out.println(res);
    }    
}
