/*

Sample Input 0:
153
Sample Output 0:
Armstrong number

Sample Input 1:
157
Sample Output 1:
Not an Armstrong number

*/




package javafundamentals;
import java.util.Scanner;
public class numcrunch9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int digits = String.valueOf(n).length();          //used to count the number of digits in n.
    int sum=0;
    while(n>0){
        int digit=n%10;
        sum += (int)Math.pow(digit, digits);
        n=n/10;
    }
     if (sum==temp){
        System.out.print("Armstrong number");
     }
    else{
        System.out.print("Not an Armstrong number");
    }
}
}
