public class LargestOfThree {
    public static void main(String[] args) {
        int a = 25, b = 20, c = 35;

        if (a >= b && a >= c){
            System.out.println("a is the largest");
        }else if (b >= c){
            System.out.println("b is the largest");
        }else {
            System.out.println("c is the largest");
        }
    }
}
