/*

Sample Input:
Input1: Lily
Input2: Johnson

Sample Output:
lily JHONSON

*/
package javafundamentals;

import java.util.Scanner;
public class string4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	System.out.print(s1.toLowerCase()+" "+s2.toUpperCase());
}
}
