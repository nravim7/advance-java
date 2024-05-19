package org.ravi;

public class Main {
    public static void main(String[] args) {
        System.out.println(Byte.MIN_VALUE+ " to "+ Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+ " to "+ Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+ " to "+ Integer.MAX_VALUE);

        byte byteValue = 60;
        short shortValue = 32000;
        int intValue = 214748364;

        long resultLongValue = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println("Resulted Long value = " + resultLongValue);
    }
}