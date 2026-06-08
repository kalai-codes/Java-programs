/*

divide the given two numbers and print the quotient without using / operator.

input:
10
2

output:
5	

*/

package javafundamentals;
import java.util.Scanner;
public class loop6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int quotient=0;
    while(n1>=n2){
        n1=n1-n2;
        quotient++;
    }
    System.out.print(quotient);
}
}
