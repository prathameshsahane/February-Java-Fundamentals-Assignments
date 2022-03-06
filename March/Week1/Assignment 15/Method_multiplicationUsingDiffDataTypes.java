package assignment_15;
import java.util.*;
public class Method_multiplicationUsingDiffDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		float num1=sc.nextInt();
		System.out.println("Enter Second number: ");
		float num2=sc.nextInt();
		System.out.println("Multiplication is: ");
		float result=Fmultiply(num1,num2);
		System.out.print(result);
	}
	
	public static int Imultiply(int n1,int n2) {
		int multiplication=0;
		multiplication=n1*n2;
		return multiplication;
	}
	public static float Fmultiply(float n1,float n2) {
		float multiplication=0;
		multiplication=n1*n2;
		return multiplication;
	}
	public static long Lmultiply(long n1,long n2) {
		long multiplication=0;
		multiplication=n1*n2;
		return multiplication;
	}
}
