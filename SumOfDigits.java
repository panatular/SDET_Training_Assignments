package assignments_SDET;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int m=1234;
		int n,sum = 0;
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);


	}

}