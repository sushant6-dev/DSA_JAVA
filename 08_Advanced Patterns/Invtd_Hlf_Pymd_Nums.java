public class Invtd_Hlf_Pymd_Nums {
    public static void PrintPattern(int n) {
      
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
          
            System.out.println();
        }
      
    }
    public static void main(String[] args) {
        PrintPattern(5);
    }
}
