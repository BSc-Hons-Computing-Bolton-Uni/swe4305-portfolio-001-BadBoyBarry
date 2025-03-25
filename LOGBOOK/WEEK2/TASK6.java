package WEEK2;

import java.util.Scanner;

public class TASK6
{
    public static void main(String[] args)
    {
        // adds in a user choice to continue
        // with the program or not
        boolean x = true;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter the times table you would like to see: ");
            int times_table = sc.nextInt();
            for (int i = 1; i < 13; i+=1)
            {
                System.out.println( i + " x " + times_table +" = " + i*times_table);
            }
            System.out.println("Do you wish to continue? (y/n)");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("n"))
            {
                x = false;
            }
        }
        while (x);
    }
}
