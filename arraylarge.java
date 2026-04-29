package javafundamentals;

import java.util.*;
import java.util.Scanner;
public class arraylarge {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
	   }
	  Arrays.sort(arr); 

   System.out.println(arr[n-1]+" ");
}
}



/*   this is interview style code
Sorting is a time complexityO(n log n)
so use for loop w/o sort

int max=arr[0];
		for(int i=0;i<n;i++) {       increment until < n
			if(arr[i]>max) {         action
			max=arr[i];          updation
			}
		}
*/