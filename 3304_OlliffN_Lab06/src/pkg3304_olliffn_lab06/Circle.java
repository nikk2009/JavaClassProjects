/*
Nikk Olliff
000212872
8/1/2016
8/1/2016
Circle class
*/
package pkg3304_olliffn_lab06;

/**
 *
 * @author Nikk
 */
public class Circle {

    double radius;
    final double PI = 3.14159;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double rad) {
        radius = rad;
    }

    public void setRadius(double rad) {
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return radius * 2 * PI;
    }
    
    
}
