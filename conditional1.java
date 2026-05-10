/*

Input:
Accept two integer as input

output:
EQUAL/NOT EQUAL

*/
package javafundamentals;
import java.util.Scanner;
public class conditional1 {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     int n1=sc.nextInt();
     int n2=sc.nextInt();
     if(n1==n2){
         System.out.print("EQUAL");
     }
     else{
          System.out.print("NOT EQUAL");
     }
 }
}
