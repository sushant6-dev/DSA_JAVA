import java.util.Scanner;

public class Array_Input_Update {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Physics marks:");
        marks[0] = sc.nextInt();

        System.out.println("Enter your Chemistry marks:");
        marks[1] = sc.nextInt();

        System.out.println("Enter your Maths marks:");
        marks[2] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);


        System.out.println("There was a correction in Maths paper your score is Updated");
        marks[2] += 2;
        System.out.println("Maths: " + marks[2]);

        System.out.println("Total Percentage: " + ((marks[0] + marks[1] + marks[2])/ 3));

        
        sc.close();
    }
}
