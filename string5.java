/*

Sample Input:
Input1: AlohoMora
Input2: 584

Sample Output:
AlohoM

*/
package javafundamentals;

import java.util.Scanner;
public class string5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	int n=sc.nextInt();
	int sum=0;
	String result="";
	for(int i=0;i<s1.length();i++) {
	 sum=sum+((int)s1.charAt(i));
	 if(sum>n) {
	   break;	 
	 } 
	 result=result+s1.charAt(i);
	}
	System.out.print(result);
	}
}
