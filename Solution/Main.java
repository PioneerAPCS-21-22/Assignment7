/**
 * This pogram evaluates the value of a trig function.
 *
 * @author Mr. King
 * @version 9/10/2021
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an x value (degrees): ");
        double xDeg = in.nextDouble();
        double xRad = Math.toRadians(xDeg);

        // f(x) = 3sin^2(x - 3PI/4) + 1
        double y = 3 * Math.pow(Math.sin(xRad - 3 * Math.PI / 4), 2.0) + 1;
        System.out.println("The point is: (" + xRad + ", " + y + ")"); 
    }
}

