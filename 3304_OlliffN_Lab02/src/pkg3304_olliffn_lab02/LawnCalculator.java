/*
Nikk Olliff
000212872
6/13/2016
6/20/2016
Lawn Care Calculator
*/
package pkg3304_olliffn_lab02;

/**
 *
 * @author Nikk
 */
import java.util.Scanner;
public class LawnCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        //Declare constants
        final double CURRENT_COST = 50.50;
        final double COST_PER_YARD = .3;
        final double DISCOUNT_RATE = .08;
        //create scanner object and declare variables
        Scanner keyboard = new Scanner(System.in);
        int streetWidth, drivewayLength, area, yards;
        double costPerYard, discount, servicePrice, total;
  
        //Get imput from user
        System.out.print("Enter the street measurment(Width): ");
        
        streetWidth = keyboard.nextInt();
        
        System.out.print("Enter the driveway measurment(Length): ");
        
        drivewayLength = keyboard.nextInt();
        
        //assign varaibles values
        area = drivewayLength * streetWidth;
        yards = area/3;
        
        costPerYard = CURRENT_COST / yards;
        servicePrice = COST_PER_YARD * yards;
        discount = servicePrice * DISCOUNT_RATE;
        total = servicePrice - discount;
        
        //decalre output
        System.out.println("The area (total feet) of the yard is " + area);
        System.out.println("The yard is " + yards + " square yards");
        System.out.println("The current cost is $" + costPerYard + " per square yard");
        System.out.println("The lawn service price is $"+servicePrice);
        System.out.println("The lawn service discount is $" + discount);
        System.out.println("The sicounted lawn service price is $" + total);
        
    }
    
}
