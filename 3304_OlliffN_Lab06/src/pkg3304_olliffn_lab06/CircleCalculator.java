/*
Nikk Olliff
000212872
8/1/2016
8/1/2016
Circle calculator
*/

package pkg3304_olliffn_lab06;

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

        double radius;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter radius of a circle: ");

        radius = keyboard.nextDouble();

        Circle userCircle = new Circle(radius);

        System.out.println("Enter the radius of a circle: " + userCircle.getRadius() + "\n"
                + "The circle's area is: " + userCircle.getArea() + "\n"
                + "The circle's diameter is " + userCircle.getDiameter() + "\n"
                + "The circle's circumference is " + userCircle.getCircumference());
        

    }

}
