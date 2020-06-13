package com.company;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Let’s imagine that you receive the results of the weather for today in the following format: ‘+26C’.
        Weather results can change. Please write part of the code which will return the following:
        a) If the weather is from -50C to -1C return “It’s super cold today. Be sure you dressed well!”
        b) If the weather is from -0C to +10C return “It’s windy outside, but we are sure you will enjoy your day!”
        c) If the weather is from +11C to +30C return “It’s time for outdoor walking!”
        d) If the weather is from +31 to 40 return “It's so hot outside!”
        e) If the weather is from +41 to 50 return return “Welcome to hell!”
        f) If the weather results do not match above values return “Please re-check results in 5 mins.*/

        System.out.println("Please enter an integer of degrees Celsius:");
        try {
            Scanner scanner = new Scanner(System.in);
            int temperature = scanner.nextInt();

            if (temperature >= -50 && temperature <= 50) {
                if (temperature >= -50 && temperature <= -1) {
                    System.out.println("It’s super cold today. Be sure you dressed well!");
                }
                if (temperature >= 0 && temperature <= 10) {
                    System.out.println("It’s windy outside, but we are sure you will enjoy your day!");
                }
                if (temperature >= 11 && temperature <= 30) {
                    System.out.println("It’s time for outdoor walking!");
                }
                if (temperature >= 31 && temperature <= 40) {
                    System.out.println("It's so hot outside!");
                }
                if (temperature >= 41 && temperature <= 50) {
                    System.out.println("Welcome to hell!");
                }
            } else
                System.out.println("Please re-check results in 5 mins.");

        } catch (InputMismatchException e) {
            System.out.println("Invalid temperature format. Please write the temperature in degrees Celsius.");
        }

    }
}
