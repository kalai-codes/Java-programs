/*
Get two numbers from user and print the values 
of the quotient and the remainder when the two values are divided.
*/

package javafundamentals;
import java.util.Scanner;
public class problem3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    double result1=(double)n1/n2;
    int result2=(n1%n2);
    System.out.println(n1+" / "+n2+" = "+result1);
    System.out.println(n1+" % "+n2+" = "+result2);
}
}
