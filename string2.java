/*

Sample Input:
input1: This is A Test STRING with LOwer Case
input2: 37

Sample Output:   (Return a string representing the lowercase letters and the total count.)
hisisestwithwerase 18

*/
package javafundamentals;

import java.util.Scanner;
public class string2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n=sc.nextInt();
	String result="";
	int count=0;
	for(int i=1;i<n;i++) {
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z') {
			result+=ch;
			count++;
		}
	}
	System.out.print(result+" "+count);
	}
}
