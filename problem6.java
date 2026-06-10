
//Check whether given number is perfect square or not.

package javafundamentals;
import java.util.Scanner;
public class problem6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int root=(int)Math.sqrt(n);
    if(root*root==n){
     System.out.print("Perfect Square");
    }
    else{
     System.out.print("Not");
    }
}
}
