import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter max number: ");


        int maxNumber;
        maxNumber = keyboard.nextInt();
        //String input = keyboard.nextLine();
        //int maxNumber = Integer.parseInt( input );

        System.out.println("List of the prime number between 1 - " + maxNumber);

        for (int num = 1; num <= maxNumber; num++)
        {
            boolean isPrime = true;
            for (int x=2; x <= num/2; x++)
            {
                if ( num % x == 0)
                {
                    isPrime = false;

                }
            }

            if ( isPrime == true )
                System.out.println(num + " is a prime number");
            else {
                System.out.println(num + " is not a prime number");
            }
        }
    }
}