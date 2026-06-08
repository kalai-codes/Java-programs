/*

print all the even numbers in the given range.

input:
2
10

output:
2 4 6 8 10	

*/

package javafundamentals;
import java.util.Scanner;
public class loop2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	for(int i=n1;i<=n2;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
}
}
