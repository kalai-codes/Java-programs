/*

Input Format:
Input will be a character  (ex.input:a)

Output Format:
Display that character    (ex.output:a)

*/
package javafundamentals;
import java.util.Scanner;
public class basic6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	System.out.print(ch);
}
}
