/*
Nikk Olliff
000212872
6/27/2016
6/27/2016
Shipping Calculator
*/

package pkg3304_olliffn_lab03;

/**
 *
 * @author Nikk
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class ShippingCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner keyboard = new Scanner(System.in);
               
        DecimalFormat money = new DecimalFormat("$0.00");
        DecimalFormat percent = new DecimalFormat("0%");

        double length, width, height, weight, surchargePercent,
                areaWeight, shippingCost, total;
        int zipCodeFirst, zipCodeLast;
        String zipCode;
        
        surchargePercent = 0;
        
        System.out.print("Please enter the zip code: ");
        
        zipCode = keyboard.nextLine();
        
        System.out.print("Please enter the weight: ");
        
        weight = keyboard.nextDouble();
        
        System.out.print("Please enter the length: ");
        
        length = keyboard.nextDouble();
        
        System.out.print("Please enter the width: ");
        
        width = keyboard.nextDouble();
        
        System.out.print("Please enter the height: ");
        
        height = keyboard.nextDouble();
        
        areaWeight = (length*width*height) + weight;
        
        zipCodeFirst = zipCode.charAt(0);
        zipCodeLast = zipCode.charAt(4);
        
        if(zipCodeLast % 2 == 0)
            surchargePercent =+ .02;
         
        switch (zipCodeFirst) {
            case '4':
                surchargePercent += .05;
                break;
            case '6':
                surchargePercent += .09;
                break;
            default:
                surchargePercent += .14;
                break;
        }
        
        if (weight <5 )
            shippingCost = 12;
        else if (areaWeight >= 5.1 && areaWeight <= 15)
            shippingCost = 14;
        else if (areaWeight >= 15.1 && areaWeight <= 34)
            shippingCost = 17;
        else if (areaWeight >= 34.1 && areaWeight <= 45)
            shippingCost = 21;
        else if (areaWeight >= 45.1 && areaWeight <= 60)
            shippingCost = 33;
        else 
            shippingCost = 105;
        
        total = shippingCost * (1+ surchargePercent);
        
        System.out.println("Zip code: " + zipCode + "\n" +
                "Weight: " + weight + "\n"+
                "Length: " + length + "\n"+
                "Width: " + width + "\n"+
                "Height: " + height);
        System.out.println("Shipping Cost: " + money.format(shippingCost)+ "\n" +
                "Surcharge: " + percent.format(surchargePercent)+ "\n" +
                "Total: " + money.format(total));

    }
    
}
