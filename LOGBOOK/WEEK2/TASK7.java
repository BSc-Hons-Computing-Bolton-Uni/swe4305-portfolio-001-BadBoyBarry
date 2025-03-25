package WEEK2;

import java.util.Scanner;

public class TASK7
{
    public static void main(String[] args)
    {
        // user input for the percentage or marks out of 100
        // and uses the if statement to see which condition is met
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int grade = sc.nextInt();

        if (grade >= 80)
        {
            System.out.println("Your grade is A");
        } else if (grade >= 60)
        {
            System.out.println("Your grade is B");
        } else if (grade >= 40)
        {
            System.out.println("Your grade is C");
        } else if (grade < 0 || grade > 100)
        {
            System.out.println("Please enter a number between 0 and 100");
        } else
        {
            System.out.println("Your grade is FAIL");
        }
    }
}
