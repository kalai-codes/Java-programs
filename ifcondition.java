
//Check whether a number ends with 5

package javafundamentals;
import java.util.Scanner;
public class ifcondition {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 10 == 5) {
    	System.out.println("Yes");
    	}
    else {
    	System.out.println("No");
    	}
}
}
