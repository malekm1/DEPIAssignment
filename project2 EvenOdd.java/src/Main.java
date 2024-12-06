//Even or odd checker.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num != 0)
        {
            System.out.println("The number " + num + " is even");
        }
        else if (num % 2 == 1 && num != 0)
        {
            System.out.println("The number " + num + " is odd");
        }
        else
        {
            System.out.println("The number is zero");
        }

        sc.close();
    }
}