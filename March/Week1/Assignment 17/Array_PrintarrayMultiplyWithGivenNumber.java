package Assignment_17;

import java.util.Scanner;

public class Array_PrintarrayMultiplyWithGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		int l=num.length;
		System.out.println("Enter the numbers in array: ");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the multiplying factor: ");
		int f=sc.nextInt();
		for(int j=0;j<l;j++) {
			System.out.print((num[j]*f)+" ");
		}
	}

}
