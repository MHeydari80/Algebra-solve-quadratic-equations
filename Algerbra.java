package algerbra;

import java.util.Scanner;

public class Algerbra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c in a correct sequence:\t");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {

            double firstRoot = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double secondRoot = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            System.out.printf("The equation has two roots: %.2f and %.2f\n", firstRoot, secondRoot);

        } else if (delta < 0) {

            System.out.println("The equation has no real roots.");

        } else {

            double firstRoot = -b / (2 * a);
            System.out.printf("The equation has no real roots: %.2f\n", firstRoot);

        }

    }

}
