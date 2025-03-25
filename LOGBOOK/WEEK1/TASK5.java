package WEEK1;

import java.util.Scanner;

public class TASK5
{
    public static void main(String[] args)
    {
        // takes two numbers and then puts them in the original order entered
        // then reverses the order
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        System.out.println("Original order: " + num1 + ", " + num2);
        System.out.println("Reversed order: " + num2 + ", " + num1);
    }
}
