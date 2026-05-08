/*

Sample Input:
Knowledge is the greatest gift

Sample Output:(The output should be an integer representing the length of the longest word in the sentence)
9

*/
package javafundamentals;

import java.util.Scanner;
public class string6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] arr=s.split(" ");
	int max=0;
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr[i].length();j++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				count++;
			}
		}
			if(count>max) {
				max=count;
			}
	}
	System.out.print(max);
}
}
