package Assignment_18;
import java.util.*;
public class Array_sumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements in array: ");
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int result=ArraySum(arr1);
		System.out.print("Sum of all elements in array is: "+result);
		
	}
	public static int ArraySum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
