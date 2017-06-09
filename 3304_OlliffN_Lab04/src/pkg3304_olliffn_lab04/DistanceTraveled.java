/*
Nikk Olliff
000212872
7/11/2016
7/11/2016
Distance Traveled
 */
package pkg3304_olliffn_lab04;

import java.util.Scanner;

/**
 *
 * @author Nikk
 */
public class DistanceTraveled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;
        int hours;
        double speed, distance;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter speed: ");

        speed = keyboard.nextDouble();

        while (speed < 0) 
        {
            System.out.print("Please enter non negative speed: ");
            speed = keyboard.nextDouble();
        }

        System.out.print("Please enter hours: ");

        hours = keyboard.nextInt();

        while (hours <= 0) {
            System.out.print("Please enter hours greater than 0: ");
            hours = keyboard.nextInt();
        }

        System.out.println("Hour\tDistance Traveled"
                + "\n--------------------------");

        while (i < hours) {

            i++;
            distance = speed * i;

            System.out.println(i + "\t" + distance);

        }

    }

}
