package WEEK1;

import java.util.Scanner;

public class TASK9
{
    public static void main(String[] args)
    {
        // takes in a user input for deposit amount then
        // calculates how much interest based on the deposit
        // you would get over a year
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        double deposit = sc.nextDouble();
        double interestRate = 0.01; // 1% interest
        double interest = deposit * interestRate;
        double total = deposit + interest;
        System.out.println("Interest earned: " + interest);
        System.out.println("Total amount after a year: " + total);
    }
}
