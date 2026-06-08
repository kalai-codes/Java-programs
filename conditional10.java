/*

 print the respective month name based on given input otherwise print invalid
 
 */

package javafundamentals;
import java.util.Scanner;
public class conditional10 {
	  public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        if(n==1){
	            System.out.print("January");
	        }
	        else if(n==2){
	            System.out.print("February");
	        }
	        else if(n==3){
	            System.out.print("March");
	        }
	        else if(n==4){
	            System.out.print("April");
	        }
	        else if(n==5){
	            System.out.print("May");
	        }
	        else if(n==6){
	            System.out.print("June");
	        }
	        else if(n==7){
	            System.out.print("July");
	        }
	        else if(n==8){
	            System.out.print("August");
	        }
	        else if(n==9){
	            System.out.print("September");
	        }
	        else if(n==10){
	            System.out.print("October");
	        }
	        else if(n==11){
	            System.out.print("November");
	        }
	        else if(n==12){
	            System.out.print("December");
	        }
	        else{
	            System.out.print("Invalid");
	        }
	    }
}
