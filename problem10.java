
//Given 2 integer values, print their pre increment and post increment values

package javafundamentals;
import java.util.Scanner;
public class problem10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Pre increment:"+(++a));
    System.out.println("Post increment:"+(b++));
    System.out.println("Final values:"+a+" "+b);
}
}
