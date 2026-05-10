/*

input:
integer(n)	

output:  
	n%3==0
n is divisible by 3   
    else
n is not divisible by 3 and gives remainder (n%3==?)

*/

package javafundamentals;
import java.util.Scanner;
public class conditional4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%3==0) {
		System.out.print("n is divisible by 3");
	}
	else {
		System.out.print("n is not divisible by 3 and gives remainder is "+ (n%3));
	}
}
}
