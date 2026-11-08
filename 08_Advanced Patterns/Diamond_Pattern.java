public class Diamond_Pattern {

    public static void PrintPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k < 2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k < 2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x = 6;
        PrintPattern(x);
    }
}
