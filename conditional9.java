/*

print corresponding day based on given input otherwise print invalid

*/

package javafundamentals;
import java.util.Scanner;
public class conditional9 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Sunday");
        }
        else if(n==1){
            System.out.print("Monday");
        }
        else if(n==2){
            System.out.print("Tuesday");
        }
        else if(n==3){
            System.out.print("Wednesday");
        }
        else if(n==4){
            System.out.print("Thursday");
        }
        else if(n==5){
            System.out.print("Friday");
        }
        else if(n==6){
            System.out.print("Saturday");
        }
        else{
            System.out.print("Invalid");
        }
    }
}
