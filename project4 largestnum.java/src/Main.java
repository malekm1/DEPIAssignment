//Largest Number checker:

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = sc.nextDouble();

        if (num1 > num2 && num1 > num3)
        {
            System.out.println("The largest number is " +num1);
        }
        else if (num2 > num1 && num2 > num3)
        {
            System.out.println("The largest number is " +num2);
        }
        else if (num3 > num1 && num3 > num2)
        {
            System.out.println("The largest number is " +num3);
        }
        else
        {
            System.out.println("The three numbers are equal");
        }

        sc.close();
    }
}