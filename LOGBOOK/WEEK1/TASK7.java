package WEEK1;

import java.time.LocalDate;
import java.util.Scanner;

public class TASK7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobInput = sc.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);
        LocalDate today = LocalDate.now();
        long daysOld = java.time.temporal.ChronoUnit.DAYS.between(dob, today);
        System.out.println("You are " + daysOld + " days old.");
    }
}
