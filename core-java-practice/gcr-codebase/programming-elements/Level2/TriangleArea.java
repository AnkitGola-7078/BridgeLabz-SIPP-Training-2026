package Level2;

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, height;
        System.out.print("Enter base in cm: ");
        base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;
        double areaSqIn = 0.5 * baseInInches * heightInInches;

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
