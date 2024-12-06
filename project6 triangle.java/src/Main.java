//Triangle checker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the second side: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the third side: ");
        double side3 = sc.nextDouble();


        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
        {
            System.out.println("Invalid Input");
        }
        else if (side1 > (side2 + side3) || side2 > (side3 + side1) || side3 > (side1 + side2))
        {
            System.out.println("This is a triangle");
        }
        else
        {
            System.out.println("This is not a triangle");
        }

        sc.close();
    }
}