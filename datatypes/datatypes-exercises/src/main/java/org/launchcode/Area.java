package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius = null;  // Initialize radius variable

        // Loop until a valid radius is entered
        do {
            System.out.print("Enter a radius: ");

            // Check if the input is a number
            if (input.hasNextDouble()) {
                radius = input.nextDouble();

                // Check if the radius is non-negative
                if (radius < 0) {
                    System.out.println("Radius cannot be negative. Please try again.");
                    radius = null;  // Reset radius so the loop continues
                }
            } else {
                // If the input is not a number, show an error
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();  // Clear the invalid input from the scanner
            }

        } while (radius == null);  // Continue the loop until a valid radius is entered

        // Calculate the area using the Circle class
        Double area = Circle.getArea(radius);

        // Display the result
        System.out.println("The area of a circle with radius " + radius + " is: " + area);
    }
}
