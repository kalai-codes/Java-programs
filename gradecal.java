//grade calculation

package javafundamentals;

import java.util.Scanner;
public class gradecal {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int mark=sc.nextInt();
	   if(mark>=90) {
		   System.out.print("Grade A");
	   }
	   else if(mark>=75 && mark<=89) {
		   System.out.print("Grade B");
	   }
	   else if(mark>=51 && mark<=74) {
		   System.out.print("Grade C");
	   }
	   else {
		   System.out.print("Fail");
	   }
   }
}
