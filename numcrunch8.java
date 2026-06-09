/*
Sample Input 0:
12
Sample Output 0:
Adam Number

Sample Input 1:
23
Sample Output 1:
Not a adam number

*/

package javafundamentals;
import java.util.Scanner;
public class numcrunch8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int rev=0;
    while(temp>0){
        int digit=temp%10;
        rev=rev*10+digit;
        temp=temp/10;
    }
    int sq1=n*n;
    int sq2=rev*rev;
    int revsq2=0;
    while(sq2>0){
        int digit=sq2%10;
        revsq2=revsq2*10+digit;
        sq2/=10;
    }
    if(sq1==revsq2){
        System.out.print("Adam Number");
    }
    else{
        System.out.print("Not a adam number");
    }
}
}
