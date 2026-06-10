
//Find the least prime factor of a given number.

package javafundamentals;
import java.util.Scanner;
public class problem9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    if (n<=1) {
         System.out.print(n);
         return;
     }
    for(int i=2;i<=n;i++){
     if(n%i==0){
         System.out.print(i);
         return;
     }
    }
    System.out.print(n);
}
}
