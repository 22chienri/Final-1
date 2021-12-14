/*
Ryan Chien
Period 4
Fall Final
part3
 */

import java.util.Scanner;

public class part3 {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);
        // get side length
        System.out.println("Enter side length:");
        double sideLength = Double.parseDouble(input.nextLine());
        // calculate perimeter
        double perimeter = sideLength * 3;
        // calculate area
        double area = (Math.sqrt(3) / 4) * sideLength * sideLength;
        // print results
        System.out.println("Side Length: " + sideLength);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
