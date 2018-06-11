/**
 * Read an integer n from console, and calculate the sum of odd digits of that integer n.
 * For example: 
 * 
 * ------------------
 * Enter an integer:32677
 * Sum = 17
 * ---------------------
 * 
 *  In above example, the input n is 32677, which has 3 odd digits  3, 7, 7. 
 *  3 + 7 + 7 = 17.   Therefore, the result is 17.
 *  
 *   @author anwar mamat
 *   
 */
package loops;

import java.util.Scanner;

public class SumOddDigits {

	public static void main(String[] args) {
		int sum=0;
		for(int num = 1; num<= 10; num++)	{
			//check if Odd
			if(num % 2 !=0) {
				sum=sum+num;
			}
		}
			System.out.println("Sum of Odds:" + sum);
		
		
			
		
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		System.out.print("Enter an integer:");
		int n;
		n = sc.nextInt();
		while (n > 0) {
			int d = n % 10;
			if (d % 2 != 0) {
				sum += d;
			}
			n /= 10;
		}

		System.out.println("Sum:" + sum);
		sc.close();
		}

}