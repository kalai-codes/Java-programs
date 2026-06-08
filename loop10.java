
//Print all the alphabets for given n times.

package javafundamentals;
import java.util.Scanner;
public class loop10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}
}
