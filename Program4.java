//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int sum = 0;
        double avg = 0;
        
        System.out.println("Enter four three-digit-numbers.");
        System.out.print("Enter first number: ");
        a = myScanner.nextInt();
        System.out.print("Enter second number: ");
        b = myScanner.nextInt();
        System.out.print("Enter third number: ");
        c = myScanner.nextInt();
        System.out.print("Enter fourth number: ");
        d = myScanner.nextInt();
        
        sum = a + b + c + d;
        avg = (a + b + c + d) / 4; // Fix this line too
        System.out.println();
        System.out.println("The first number is: " + a);
        System.out.println("The second number is: " + b);
        System.out.println("The third number is: " + c);
        System.out.println("The fourth number is: " + d);
        System.out.println();
        System.out.println("The sum is: " + sum);
        System.out.println();
        System.out.println("The average is: " + avg);
        System.out.println();
        System.out.println("This program was written by:");
        System.out.print("Kyle Tan on 8/13/24 in 1st period");
    }
}


//Paste console output below:
/*

Enter four three-digit-numbers.
Enter first number: 475
Enter second number: 821
Enter third number: 369
Enter fourth number: 562

The first number is: 475
The second number is: 821
The third number is: 369
The fourth number is: 562

The sum is: 2227

The average is: 556

This program was written by:
Kyle Tan on 8/13/24 in 1st period

*/
