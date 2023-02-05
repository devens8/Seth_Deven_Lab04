public class Variables {
    public static void main(String[] args) {
        //integer variables
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 7;

        //double variables
        double doubleOperandA = 1.0;
        double doubleOperandB = 2.0;
        double doubleSum = 3.0;
        double doubleProduct = 4.0;
        double doubleDifference = 5.0;
        double doubleQuotient = 6.0;

        //executing integer operations
        intSum = intOperandA + intOperandB;
        System.out.println("The int sum of " + intOperandA + " and " + intOperandB +  " is " + intSum); // The sum of 1 and 2 is 3

        intProduct = intOperandA * intOperandB;
        System.out.println("The int product of " + intOperandA + " and " + intOperandB +  " is " + intProduct); // The product of 1 and 2 is 2

        intDifference = intOperandA - intOperandB;
        System.out.println("The int difference of " + intOperandA + " and " + intOperandB +  " is " + intDifference); // The difference of 1 and 2 is -1

        intQuotient = intOperandA / intOperandB;
        System.out.println("The int quotient of " + intOperandA + " and " + intOperandB +  " is " + intQuotient); // The quotient of 1 and 2 is 0

        intModulo = intOperandA % intOperandB;
        System.out.println("The int modulus of " + intOperandA + " and " + intOperandB +  " is " + intModulo); // The sum of 1 and 2 is 2


        //executing double operations
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The double sum of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleSum); // The sum of 1.0 and 2.0 is 3.0

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The double product of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleProduct); // The product of 1.0 and 2.0 is 2.0

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The double difference of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleDifference); // The difference of 1.0 and 2.0 is -1.0

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The double quotient of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleQuotient); // The quotient of 1.0 and 2.0 is 0.5

    }
}