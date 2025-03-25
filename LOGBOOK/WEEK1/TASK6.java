package WEEK1;

import java.time.LocalDate;
import java.util.Scanner;

public class TASK6
{
    public static void main(String[] args)
    {
        // uses age of the user to the take it away from the local date
        // which is imported from a package and then it displays that result
        // example - 2025-20 = 2005
        Scanner sc = new Scanner(System.in);
        System.out.println("Program 6: Calculate Birth Year from Age");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        int currentYear = LocalDate.now().getYear();
        int birthYear = currentYear - age;
        System.out.println("You were born in: " + birthYear);
    }
}
