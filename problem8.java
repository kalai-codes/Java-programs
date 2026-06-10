
//Find the greatest prime factor of given number.

package javafundamentals;
import java.util.Scanner;
public class problem8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int greatestprime=1;
    for(int i=2;i<=n;i++){
     if(n%i==0){
         greatestprime=i;
         n=n/i;
     }
    }
    System.out.print(greatestprime);
}
}
