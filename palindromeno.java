package javafundamentals;

import java.util.Scanner;
public class palindromeno {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int forword=n;
	   int backword=0;
	   while(n>0) {
		   int digit=n%10;
		   backword=backword*10+digit;
		   n=n/10;	   
	   }
	   if(forword==backword) {
		   System.out.println("n is palindrome");
	   }
	   else {
		   System.out.println("n is not palindrome");
	   }
   }
}
