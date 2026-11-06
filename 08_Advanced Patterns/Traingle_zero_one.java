public class Traingle_zero_one {

    public static void PrintPattern(int n){
        int x = 1;
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                x = 0;
            }
            else{
                x = 1;
            }
            for(int j = 1; j<=i; j++){
                System.out.print(x + " ");
                if(x == 1){
                    x = 0;
                }else{
                    x = 1;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintPattern(5);
    }
}
