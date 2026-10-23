import java.util.*;

public class JavaInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();

        System.out.println("Hello" + " " + firstName);

        Float price = sc.nextFloat();
        System.out.println(price + 100);

        sc.close();
    }
}