/*

Sample Input: 
25
98

Sample output:
00025
   98

*/
package javafundamentals;

import java.util.Scanner;
public class basic8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.printf("%05d\n",n1);
	System.out.printf("%5d\n",n2);
}
}
