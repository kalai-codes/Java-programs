/*

 find the LCM of the given two numbers.
 
 input:
8
5
output:
40	

*/

package javafundamentals;
import java.util.Scanner;
public class loop7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int lcm;
    if(n1>n2){
        lcm=n1;
    }
    else{
        lcm=n2;
    }
    
    while(true){
        if (lcm%n1==0 && lcm%n2==0) {
            System.out.print(lcm);
            break;
    }
    lcm++;
    }
}
}
