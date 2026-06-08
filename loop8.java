/*

Display the sum of even numbers in the given input

input:10  output:30

*/

package javafundamentals;
import java.util.Scanner;
public class loop8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
        if(i%2==0){
            sum+=i;
        }
    }
    System.out.print(sum);
}
}
