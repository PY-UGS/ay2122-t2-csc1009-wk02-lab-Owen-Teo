import java.util.Scanner;
public class Wk2Q1 {

    public static void main (String[] args){
        double pi = 3.14159; // pi
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius:"); //input
        double radius = input.nextDouble();
        /*.out.print("Enter a byte value:");
        byte byteValue = input.nextByte();*/

        double area = radius * radius * pi;
        System.out.println("The area for the circle of radius :" + "" + radius + " is " + "" +area);

    }

}

