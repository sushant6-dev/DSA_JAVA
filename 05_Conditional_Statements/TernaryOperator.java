public class TernaryOperator {
    public static void main(String[] args) {
        int num = 6;

        String num_type = ((num % 2) == 0) ? "EVEN" : "ODD";

        System.out.println(num_type);
    }
}
