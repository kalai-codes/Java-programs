/*
 
Sample Input :
Input1: helloworld
Input2: 10
Input3: l

Sample Output:
3

*/
package javafundamentals;

import java.util.Scanner;
public class string1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=1;i<n;i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
	}
}
