import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Assignment 1

        // int user_num = sc.nextInt();

        // if (user_num >= 0){
        //     System.out.println("Positive");
        // }else {
        //     System.out.println("Negative");
        // }

        // Assignment 2
        // System.out.println("Please enter your body temperature:");
        // double user_temp = sc.nextDouble();

        // if (user_temp >= 100){
        //     System.out.println("You have a fever");
        // }else {
        //     System.out.println("You don't have a fever");
        // }

        // Assignment 3
        // System.out.println("Enter Week number:");
        // int week_no = sc.nextInt();

        // switch (week_no) {
        //     case 1:{
        //         System.out.println("Monday");
        //         break;
        //     }
        //     case 2:{
        //         System.out.println("Tuesday");
        //         break;
        //     }
        //     case 3:{
        //         System.out.println("Wednesday");
        //         break;
        //     }
        //     case 4:{
        //         System.out.println("Thursday");
        //         break;
        //     }
        //     case 5:{
        //         System.out.println("Friday");
        //         break;
        //     }
        //     case 6:{
        //         System.out.println("Saturday");
        //         break;
        //     }
        //     case 7:{
        //         System.out.println("Sunday");
        //         break;
        //     }
                
        //     default:{
        //         System.out.println("Out of scope");
        //         break;
        //     }
        // }

        System.out.println("Enter year to check leap year:");
        int year = sc.nextInt();

        if((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
