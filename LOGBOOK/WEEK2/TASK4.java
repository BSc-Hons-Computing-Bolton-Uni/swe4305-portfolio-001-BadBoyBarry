package WEEK2;

public class TASK4
{
    public static void main(String[] args)
    {
        // prints out the 7 times tables
        // until it reaches 7*12
        int num1 = 1;
        int num2 = 7;
        do
        {
            System.out.println(+ num1 +" x " + num2 + " = " + num1 * num2);
            num1++;
        }while(num1 < 13);
    }
}
