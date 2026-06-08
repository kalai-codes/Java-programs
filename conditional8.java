/*

check whether the date is valid or not. Year will be in range 1900 to 9999

input:
dd/mm/yy      (ex:08/16/2000)

output:
valid or invalid  (ex:invalid)

*/

package javafundamentals;
import java.util.Scanner;
public class conditional8 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String date=sc.nextLine();
	  String[] arr=date.split("/");
	  int dd=Integer.parseInt(arr[0]);
      int mm=Integer.parseInt(arr[1]);
      int yy=Integer.parseInt(arr[2]);
      
      if(dd<1 || mm<1 || mm>12 || yy<1900 || yy>9999) {
    	  System.out.print("Invalid");
      }
      else if(mm==2) {
    	  if(((yy%4==0 && yy%100!=0) || yy%400==0)&& dd<=29) {
    		  System.out.print("Valid");
    	  }
    	  else if(dd<=28){
              System.out.print("Valid");
    	  }
          else {
              System.out.print("Invalid");
          }
      }
      else if((mm==4 || mm==6 || mm==9 || mm==11) && dd>30){
    	  System.out.print("Invalid");
      }
      else if(dd>31) {
    	  System.out.print("Invalid");
      }
      else {
    	  System.out.print("Valid");
      }
  }
}
