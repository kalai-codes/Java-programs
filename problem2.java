
//Get two numbers from the user and print the difference between the two numbers

package javafundamentals;
import java.util.Scanner;
public class problem2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int difference=(n1-n2);
    System.out.print(difference);
}
}
