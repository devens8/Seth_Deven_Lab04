public class Lab_04_03_MonthlyCCBalance {

    public static void main(String[] args) {

        //variables
        double cardBalace = 5000;
        double INTEREST_RATE = 0.17;
        double interest = cardBalace;
        //output
        for(int i = 0; i <=2; i++){
            interest *= INTEREST_RATE;
            System.out.println("The interest due after " + i + " month is $" + interest);
        }
    }
}
