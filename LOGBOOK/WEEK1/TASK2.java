package WEEK1;

import java.util.Scanner;

public class TASK2
{
    public static void main(String[] args)
    {
        // inputs name and the prints hello + name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
