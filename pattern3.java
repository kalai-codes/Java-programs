/*
 
Q:n=5
*****
****
***
**
*

 */
package javafundamentals;

import java.util.Scanner;
public class pattern3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int row=1;row<=n;row++) {
		for(int star=1;star<=n-row+1;star++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}