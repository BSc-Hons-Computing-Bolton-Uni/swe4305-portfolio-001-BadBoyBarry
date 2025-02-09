package WEEK2;

import java.util.Scanner;

public class TASK2
{
    public static void main(String[] args)
    {
        System.out.print("Enter the letter grade:");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        switch (grade)
        {
            case "A":
                System.out.println("Grade: 1:1");
                break;
            case "B":
                System.out.println("Grade: 2:1");
                break;
            case "C":
                System.out.println("Grade: 2:2");
                break;
            case "D":
                System.out.println("Grade: 3rd");
                break;
            case "E":
                System.out.println("Grade: ordinary");
                break;
            case "F":
                System.out.println("Grade: fail");
                break;
        }
    }
}
