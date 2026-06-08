/*

 find whether the given number is power of 2 or not.
 
 ex: 
    input   output
	 8      yes
     17     no

*/

package javafundamentals;
import java.util.Scanner;
public class loop1 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  while(n>0 && n%2==0) {
		  n=n/2;
	  }
	  if(n==1) {
		  System.out.print("Yes");
	  }
	  else {
		  System.out.print("No");
	  }
  }
}
