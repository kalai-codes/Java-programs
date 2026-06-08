/*

input:
10

output:
1 2 3 4 5 6 7 8 9 10	

*/

package javafundamentals;
import java.util.Scanner;
public class loop3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.print(i+" ");
	}
}
}
