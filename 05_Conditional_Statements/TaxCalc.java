public class TaxCalc {
    public static void main(String[] args) {
        double income = 1800000;
        double tax = 0;

        if (income < 500000){
            tax = 0;
        }else if (income >= 500000 && income < 1000000){
            tax = 0.2;
        }else{
            tax = 0.3;
        }
        income = income - (tax * income);
        System.out.println("Net Take Home Income: " + income);
    }
}
