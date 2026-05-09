/*

Input:
Input will be an integer

Output:
Display the integer along with its sign

*/
package javafundamentals;

import java.util.Scanner;
public class basic7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>0) {
		System.out.print("+"+n);
	}
	else {
		System.out.print(n);
	}
}
}
