public class Dec_to_Binary {
    public static void main(String[] args) {
        int num = 8;
        int binNum = 0;
        int i = 0;
        while (num > 0) {
            int dig = num % 2;

            binNum = binNum  + dig * (int)Math.pow(10, i);
            num = num / 2;
            i++;
        }

        System.out.println(binNum);
    }
}
