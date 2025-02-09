package WEEK2;

import java.util.Scanner;

public class TASK5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the times table you would like to see: ");
        int times_table = sc.nextInt();
        for (int i = 1; i < 13; i+=1)
        {
            System.out.println( i + " x " + times_table +" = " + i*times_table);
        }
    }
}
