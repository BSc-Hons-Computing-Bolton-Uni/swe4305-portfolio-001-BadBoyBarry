package WEEK1;

import java.util.Scanner;

public class TASK8
{
    public static void main(String[] args)
    {
        // converts feet to miles
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        double feet = sc.nextDouble();
        double miles = feet / 5280;
        System.out.println(feet + " feet is " + miles + " miles.");
    }
}
