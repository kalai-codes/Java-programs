/*

input:
6	
5

output:
1 * 5 = 5
2 * 5 = 10
3 * 5 = 15
4 * 5 = 20
5 * 5 = 25
6 * 5 = 30

*/

package javafundamentals;
import java.util.Scanner;
public class loop5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    for(int i=1;i<=n1;i++){
        System.out.println(i+" * "+n2 +" = "+(i*n2));
    }
}
}
