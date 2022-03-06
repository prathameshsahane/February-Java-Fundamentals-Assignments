package Assignment_16;
import java.util.*;
public class Method_SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		swap(num1,num2);
	}
	public static void swap(int n1,int n2) {
		System.out.print("Before Swapping: "+n1+" "+n2+ "\n");
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.print("After Swapping: "+n1+" "+n2);
	}

}
