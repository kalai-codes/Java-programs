/*

 Count the number of occurrences of a digit in a given number

Input Format:3
12224
2

output:3

*/

package javafundamentals;
import java.util.Scanner;
public class numcrunch2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n1=sc.nextLong();
	int n2=sc.nextInt();
	int count=0;
	while(n1>0) {
		if(n1%10==n2) {
			count++;
		}
		n1=n1/10;
	}
	System.out.print(count);
}
}
