/*
Nikk Olliff
000212872
7/18/2016
7/18/2016
Meter Conversion
*/
package pkg3304_olliffn_lab05;

import java.util.Scanner;

/**
 *
 * @author Nikk
 */
public class ConversionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double meters;
        int menuChoice = 0;
        Scanner keyboard = new Scanner(System.in);

        do {

            do {
                 System.out.print("Please enter meters: ");

                meters = keyboard.nextDouble();
            
                 if (meters <= 0) {
                     System.out.println("Meters must be positive ");
                     continue;
                 }
                menu();
                
                menuChoice = keyboard.nextInt();

                switch (menuChoice) {
                    case 1:
                        showKilometers(meters);
                        break;
                    case 2:
                        showInches(meters);
                        break;
                    case 3:
                        showFeet(meters);
                        break;
                    case 4:
                        System.out.println("Goodbye");
                        break;
                    default:
                        System.out.println("The valid choices are 1 through 4\nPlease try again");
                }
            } while (menuChoice != 4);

        }while (menuChoice!=4);
    }
    public static void menu(){
    System.out.print("1. Convert to kilometers\n"
                        + "2. Convert to inches\n"
                        + "3. Convert to feet\n"
                        + "4. Quit the program\n"
                        + "Enter your choice: ");
    }
    
    public static void showKilometers(double meters) {
        double kilometers = meters * .001;

        System.out.println(meters + " meters is " + kilometers + " kilometers.");
    }

    public static void showInches(double meters) {
        double inches = meters * 39.37;

        System.out.println(meters + " meters is " + inches + " inches.");
    }

    public static void showFeet(double meters) {
        double feet = meters * 3.281;

        System.out.println(meters + " meters is " + feet + " feet.");
    }
}
