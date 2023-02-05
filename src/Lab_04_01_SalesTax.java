public class Lab_04_01_SalesTax {

    public static void main(String[] args) {

        //declaring variables
        double purchasePrice = 10;
        double TAX_RATE = 0.05;
        double salesTax = purchasePrice * TAX_RATE;

        //output
        System.out.println("The price of purchase is $" + purchasePrice + " and the sales tax is $" + salesTax);
    }
}

