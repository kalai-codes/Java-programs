/*

Q:n=5 output like this
*    *
 *  * 
  *  
 *  * 
*    *

*/
package javafundamentals;

import java.util.Scanner;
public class pattern15 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  for(int row=1;row<=n;row++) {
		  for(int col=1;col<=n;col++) {
			  if(row==col || row+col==n+1) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
  }
}
