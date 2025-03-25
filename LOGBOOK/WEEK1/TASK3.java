package WEEK1;

import java.util.Scanner;

public class TASK3
{
    public static void main(String[] args)
    {
        // takes in two inputs for a calculation of the perimeter
        // and area of a rectangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = sc.nextDouble();
        double perimeter = 2 * (length + height);
        double area = length * height;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
