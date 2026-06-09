
//display the digits of a given number from right to left

package javafundamentals;
import java.util.Scanner;
public class numcrunch6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
    while(n>0) {
      int digit=n%10;
      System.out.print(digit+" ");
      n=n/10;
    }
}
}
