import java.util.Scanner;

public class AreaOfSq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float side = s.nextFloat();

        float area = side * side; 

        System.out.println("Area of Square is: " + area);

        s.close();
    }
}
