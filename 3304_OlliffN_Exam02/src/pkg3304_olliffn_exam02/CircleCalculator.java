/*
Nikk Olliff
000212872
7/18/2016
7/18/2016
Circle Calculation
*/
package pkg3304_olliffn_exam02;

import java.util.Scanner;

/**
 *
 * @author Nikk
 */
public class CircleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double radius;
        int menuChoice = 0;

        do {

            System.out.print("Please enter radius: ");

            radius = keyboard.nextDouble();
            if (radius <= 0) {
                System.out.println("Radius cannot be negative or zero.");
                continue;
            }

            do {

                menu();

                menuChoice = keyboard.nextInt();

                switch (menuChoice) {
                    case 1:
                        calculateArea(radius);
                        break;
                    case 2:
                        calculateDiameter(radius);
                        break;
                    case 3:
                        calculateCircumference(radius);
                        break;
                    case 4:
                        System.out.println("Goodbye");
                        break;
                    default:
                        System.out.println("The valid choices are 1 through 4\nPlease try again");
                }
            } while (menuChoice != 4);

        } while (menuChoice != 4);

    }

    public static void menu() {
        System.out.print("1. Calculate Area\n"
                + "2. Calculate Diameter\n"
                + "3. Convert Circumference\n"
                + "4. Exit the program\n"
                + "Enter your choice: ");
    }

    public static void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Thea area of the circle is " + area);
    }

    public static void calculateDiameter(double radius) {
        //In the assingment you had the formula incorrect, D!=3.14R
        double diameter = 2 * radius;
        System.out.println("Thea diameter of the circle is " + diameter);
    }

    public static void calculateCircumference(double radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Thea rea of the circle is " + circumference);
    }

}
