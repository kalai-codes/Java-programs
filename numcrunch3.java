/*

 find the product of the digits in a given number
 
 input:123   output:6
 
 */

package javafundamentals;
import java.util.Scanner;
public class numcrunch3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int product=1;
	while(n>0) {
		int digit=n%10;
		product*=digit;
		n=n/10;
	}
	System.out.print(product);
}
}
