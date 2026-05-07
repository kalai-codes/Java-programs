/*

Sample Input:
Input1: welcome to mettl
Input2: l

Sample Output:
wecome to mett

*/
package javafundamentals;

import java.util.Scanner;
public class string3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char ch=sc.next().charAt(0);
	String result="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=ch) {
			result+=s.charAt(i);
		}
	}
	System.out.print(result);
}
}
