/*

check the number is either divisible by 3 or divisible by 5 and display the corresponding message
n%3==0  Hi
n%5==0  Hello
n%3==0&n%5==0  HiHello

*/

package javafundamentals;
import java.util.Scanner;
public class conditional5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%3==0 && n%5==0) {
		System.out.print("HiHello");
	}
	else if(n%3==0) {
		System.out.print("Hi");
	}
	 else if(n % 5 == 0) {
         System.out.println("Hello");
     }
}
}
