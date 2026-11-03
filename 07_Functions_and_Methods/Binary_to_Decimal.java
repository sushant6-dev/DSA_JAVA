public class Binary_to_Decimal {

    public static int Bin_to_Dec(int num){
        int i = 0;
        int binary_form = 0;
        while(num > 0){
            int last_dig = num % 10;

            binary_form = (int) (binary_form + (last_dig * Math.pow(2, i)));
            
            num = num / 10;
            i++;
        }
        return binary_form;
    }
    public static void main(String[] args) {
        System.out.println(Bin_to_Dec(1000));
    }
}
