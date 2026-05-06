/*

Q:n=5
**
****
******
********
**********

 */
package javafundamentals;

import java.util.Scanner;
public class pattern7 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  for(int row=1;row<=n;row++) {
		  for(int star=1;star<=2*row;star++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
  }
}
