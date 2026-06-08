/*

multiply the given two numbers without using * operator.

input:10 2   output:20

*/

package javafundamentals;
import java.util.Scanner;
public class loop9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int product=0;
    for(int i=1;i<=n2;i++){
        product+=n1;
    }
    System.out.print(product);
}
}
