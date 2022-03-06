package Assignment_17;

import java.util.Scanner;

public class Array_CountOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int l = num.length;
		int count = 0;
		System.out.println("Enter the numbers in array: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < l; i++) {
			if (num[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Total number of even numbers in given array is: "+count);
	}

}
