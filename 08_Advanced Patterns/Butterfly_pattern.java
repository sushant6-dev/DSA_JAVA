public class Butterfly_pattern {
    public static void PrintPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print('*');
            }
            for(int k = 1; k < -i + n + 1; k++){
                System.out.print(" ");
            }
            for(int l = 1; l < -i + n + 1; l++){
                System.out.print(" ");
            }
            for(int m = 1; m<=i; m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print('*');
            }
            for(int k = 1; k < -i + n + 1; k++){
                System.out.print(" ");
            }
            for(int l = 1; l < -i + n + 1; l++){
                System.out.print(" ");
            }
            for(int m = 1; m<=i; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintPattern(5);
    }
}
