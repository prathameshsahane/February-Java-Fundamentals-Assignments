package Assignment_16;
import java.util.*;
public class Method_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Fibonacci(n);
	}
	
	public static void Fibonacci(int num) {
		int n1=0,n2=1;
		System.out.print(n1+" "+n2);
		int n3;
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
