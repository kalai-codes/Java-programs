/*

sample input: 20

sample output: 1 3 5 7 9 11 13 15 17 19

*/

package javafundamentals;
import java.util.Scanner;
public class loop4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
        if(i%2!=0){
            System.out.print(i+" ");
        }
    }
}
}
