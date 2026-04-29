package javafundamentals;

import java.util.Scanner;
public class numbercheck {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   if(n==0) {
		   System.out.print("zero");
	   }
	   else if(n<0) {
		   System.out.print("negative");
	   }
	   else {
		   System.out.print("positive");
	   }
   }
}
