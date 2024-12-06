//Vowel checker:

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a letter: ");
        char letter = sc.next().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        {
            System.out.println("The leter " + letter + " is a vowel.");
        }
        else if (letter != 'a' || letter != 'e' || letter != 'i' || letter != 'o' || letter != 'u' || letter != 'A' || letter != 'E' || letter != 'I' || letter != 'O' || letter != 'U')
        {
            System.out.println("The letter " + letter + " is not a vowel.");
        }
        else
        {
            System.out.println("Invalid character!! Please try again");
        }

        sc.close();
    }
}