package org.ravi;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an Alien!!");
            System.out.println("And it is Scared!!");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got high score!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        //ternary operator

        //1
        String makerOfCar = "TATA";
        boolean isDomestic = (makerOfCar == "TATA") ? true : false;
        if (isDomestic) {
            System.out.println("This car is Domestic");
        }

        //2
        int ageOfClient = 20;
        String ageText = (ageOfClient >= 20) ? "Over Eighteen" : "Still a Kid";
        System.out.println("Our client is " + ageText);

    }
}
