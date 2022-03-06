package Assignment_18;

import java.util.*;

public class Array_printLastindexOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int l = num.length;
		
		System.out.println("Enter the numbers in array: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("Enter the number for which index to be find: ");
		int number=sc.nextInt();
		int index=0;
		for(int i=0;i<l;i++) {
			if(num[i]==number) {
				
				index=i;
			}
		}
		System.out.print("Last index of element is: "+(index+1));
	}

}
