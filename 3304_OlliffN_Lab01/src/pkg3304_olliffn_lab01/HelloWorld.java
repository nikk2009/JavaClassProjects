/*
Nikk Olliff
000212872
6/13/2016
6/20/2016
Hello World!
 */
package pkg3304_olliffn_lab01;

/**
 *
 * @author Nikk
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

int bonus, sales = 1250; 
if (sales > 1000)
  bonus = 100;
if (sales > 750)
  bonus = 50;
if (sales > 500)
  bonus = 25;
else
  bonus = 0;

System.out.println(bonus);
double v;
v = 1.0f;
		
float w;
w = 1.0f;

for (int number = 5; number <= 15; number +=3)
  System.out.print(number + ", ");

int x = 12, y = 5;
x += y--;
System.out.println(x +" ," + y);


    }
    
}
