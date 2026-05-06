/*

Q:n=5
**********
****  ****
***    ***
**      **
*        *

*/
package javafundamentals;

import java.util.Scanner;
public class pattern10 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  for(int row=n;row>=1;row--) {
		  for(int star=1;star<=row;star++) {
			  System.out.print("*");
		  }
		  for(int space=1;space<=2*(n-row);space++) {
			  System.out.print(" ");
		  }
		  for(int star=1;star<=row;star++) {
			  System.out.print("*");
	  }
		  System.out.println();
	  }
  }
}
