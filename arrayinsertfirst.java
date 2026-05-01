package javafundamentals;

import java.util.Scanner;
public class arrayinsertfirst {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] arr=new int[n+1];
	  for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
	  }
	  for(int i=n;i>=1;i--) {
		  arr[i]=arr[i-1];
	  }
	  int x=sc.nextInt();
	  arr[0]=x;
	  for(int i=0;i<=n;i++) {
		  System.out.print(arr[i]+" ");
	  }
  }
}
