package javafundamentals;

import java.util.Scanner;
public class arrayinsertend {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] arr=new int[n+1];
	  for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
	  }
	  int x=sc.nextInt();
	  arr[n]=x;
	  for(int i=0;i<=n;i++) {
		  System.out.print(arr[i]+" ");
	  }
  }
}
