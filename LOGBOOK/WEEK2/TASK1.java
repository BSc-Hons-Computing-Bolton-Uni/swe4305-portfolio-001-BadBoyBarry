package WEEK2;

import java.time.LocalDate;
import java.util.Scanner;

public class TASK1
{
    public static void main(String[] args)
    {
        // takes user input of their age
        // calculates their birth year and says
        // whether they are above the age of 18 or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Program 1: Calculate Birth Year from Age");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        int currentYear = LocalDate.now().getYear();
        int birthYear = currentYear - age;
        if (age >= 18)
        {
            System.out.println("You are above the age of 18.");
        }
        System.out.println("You were born in: " + birthYear);
    }
}
