package org.ravi;

public class OperatorPrecedenceChallenge {

    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;

        double resultedValue = (firstValue + secondValue) * 100;
        System.out.println("Total value = " + resultedValue);

        double remainderValue = resultedValue % 40.00;
        System.out.println("The Remainder = " + remainderValue);

        boolean hasRemainderValue = (remainderValue == 0) ? true : false;
        if (!hasRemainderValue) {
            System.out.println("The Remainder is present!!");
        }
    }
}
