package assignment_15;
import java.util.*;
public class Method_Add_2_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second number: ");
		int num2=sc.nextInt();
		int result=add(num1,num2);
		System.out.println("Sum of "+num1+" and "+num2+" is: "+result);
	}
	
	public static int add(int n1,int n2) {
		int sum=0;
		sum=n1+n2;
		return sum;
	}
}
