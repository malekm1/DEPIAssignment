//Checks grade.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        int grade = sc.nextInt();

        if (grade > 100 || grade < 0)
        {
            System.out.println("Invalid grade");
        }
        else if (grade >= 90)
        {
            System.out.println("A+");
        }
        else if (grade >= 80)
        {
            System.out.println("A");
        }
        else if (grade >= 70)
        {
            System.out.println("B");
        }
        else if (grade >= 60)
        {
            System.out.println("C");
        }
        else if (grade >= 50)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
        sc.close();
    }
}