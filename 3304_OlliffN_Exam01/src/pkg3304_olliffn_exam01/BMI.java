/*
Nikk Olliff
000212872
7/6/2016
7/6/2016
BMI Calculator 
 */
package pkg3304_olliffn_exam01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Nikk
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat twoPlaces = new DecimalFormat("#.00");
        
        double weight, height, bmi;
        String gender, status;

        System.out.print("Enter gender: ");
        gender = keyboard.nextLine();

        switch (gender.toLowerCase()) {
            case "male":
                
                System.out.print("Enter weight: ");
                weight = keyboard.nextDouble();

                System.out.print("Enter height: ");
                height = keyboard.nextDouble();

                bmi = (weight * 703) / Math.pow(height, 2);
                
                if (bmi < 18.5) {
                    status = "Underweight";
                } else if (bmi >= 18.5 && bmi <= 25) {
                    status = "Optimal";
                } else {
                    status = "Overwight";
                }
                System.out.println("Your BMI is: " + twoPlaces.format(bmi));
                System.out.println("You are " + status);
                break;

            case "female":
                
                System.out.print("Enter weight: ");
                weight = keyboard.nextDouble();

                System.out.print("Enter height: ");
                height = keyboard.nextDouble();

                bmi = (weight * 703) / Math.pow(height, 2);
                
                if (bmi < 17) {
                    status = "Underweight";
                } else if (bmi >= 17 && bmi <= 22) {
                    status = "Optimal";
                } else {
                    status = "Overwight";
                }

                System.out.println("Your BMI is: " + twoPlaces.format(bmi));
                System.out.println("You are " + status);
                break;

            default:
                System.out.println("please enter a valid gender");
                break;

        }

       
    }

}
