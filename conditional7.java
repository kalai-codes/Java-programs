/*

check whether the time is valid or not
example:
	16:70:45    not valid
	11:45:45    valid

*/
package javafundamentals;
import java.util.Scanner;
public class conditional7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String time=sc.nextLine();
		String[] arr=time.split(":");
		int h=Integer.parseInt(arr[0]);
		int m=Integer.parseInt(arr[1]);
		int s=Integer.parseInt(arr[2]);
		
		if((h>=0 && h<24) && (m>=0 && m<60) &&(s>=0 && s<60)) {
			System.out.print("Valid");
		}
		else {
			System.out.print("Not Valid");
		}
	}
}
