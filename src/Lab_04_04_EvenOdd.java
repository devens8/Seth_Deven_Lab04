public class Lab_04_04_EvenOdd {

    public static void main(String[] args) {
        //variables
        int input = 10;

        //Output
        if (input % 2 == 0){ // Prints number is even only if the modulo of input is 0
            System.out.println("The number " + input + " is even");
        } else { //prints number is odd it modulo if input is not 0 i.e. it is 1
            System.out.println("The number " + input + "is odd");
        }
    }
}
