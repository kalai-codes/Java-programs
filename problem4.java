
//Multiply two decimals and print the product with a precision of 2 decimal places .

package javafundamentals;
import java.util.Scanner;
public class problem4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    double n1 = sc.nextDouble();
    double n2 = sc.nextDouble();
    double product = n1 * n2;
    System.out.printf("%.2f", product);
}
}
