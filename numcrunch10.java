/*

Sample Input 0:
145
Sample Output 0:
Strong Number

Sample Input 1:
98
Sample Output 1:
Not a strong number

*/
package javafundamentals;
import java.util.Scanner;
public class numcrunch10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    while(n>0){
        int digit=n%10;
        int fact=1;
        for(int i=1;i<=digit;i++){
            fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
    }
    if (sum==temp){
        System.out.print("Strong Number");
        }
    else{
        System.out.print("Not a strong number");
    }
}
}
