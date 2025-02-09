package WEEK1;

import java.time.LocalDate;
import java.util.Scanner;

public class TASK6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program 6: Calculate Birth Year from Age");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        int currentYear = LocalDate.now().getYear();
        int birthYear = currentYear - age;
        System.out.println("You were born in: " + birthYear);
    }
}
