import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter degrees: ");
        double deg = in.nextDouble();

        // double sqrt = Math.sqrt(n);
        // System.out.println("The square root of " + n + " is " + sqrt);

        // double cos = Math.cos(Math.PI / 2);
        
        double rad = Math.toRadians(deg);
        double cos = Math.cos(rad); 

        System.out.println("cos(x) = " + cos);

    }
}




