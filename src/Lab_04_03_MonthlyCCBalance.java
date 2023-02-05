public class Lab_04_03_MonthlyCCBalance {

    public static void main(String[] args) {

        //variables
        double cardBalace = 5000;
        double INTEREST_RATE = 0.17;
        double interest;
        //output
        for(int i = 1; i <=2; i++){
            interest = cardBalace * INTEREST_RATE;
            cardBalace += interest;
            System.out.println("The interest due after " + i + " month is $" + interest); //Prints the interest after 1 month and 2 months
        } //The for loop adds interest each time the month increases -- in this case it is 2 months
    }
}
