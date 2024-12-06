// Calculator app

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome: Please enter the first number: ");
        double Num1 = sc.nextDouble();
        System.out.print("Please enter the second number: ");
        double Num2 = sc.nextDouble();
        double result;
        System.out.print("Welcome: Please enter the operation: 1.Add 2.Subtract 3. Multiply 4. Divide: ");
        int operation = sc.nextInt();

        if (operation == 1) {
            result = Num1 + Num2;
            System.out.println("The Result of the sum is " + result);
        } else if (operation == 2) {
            result = Num1 - Num2;
            System.out.println("The Result of the subtraction is " + result);
        } else if (operation == 3) {
            result = Num1 * Num2;
            System.out.println("The Result of the multiplication is " + result);
        } else if (operation == 4) {
            result = Num1 / Num2;
            System.out.println("The Result of the division is " + result);
        } else {
            System.out.println("Invalid Operation!!! Please try again.");
        }

        sc.close();
    }
}