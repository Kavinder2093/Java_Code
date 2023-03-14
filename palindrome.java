/* 11, 151, 676
 * 676%10= 6=c
 * 676/10=67 
 * 67%10=7=b
 * 67/10=6=a
 * if(abc==cba)
 * 
 * 
 * 
 */
package main
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = t.nextInt();
		int a,b,c,n1;
		c=(n%10);//676%10==6
		n1=(n/10) ;//676/10==67
		b=(n1%10);// 67%10=7
		a=(n1/10);
		//if(n>100)
		{
		if((a)+(b)+(c)==((c)+(b)+(a)))
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
			
		}
		}

	}

}
