package Assignment_17;
import java.util.*;
public class Array_sumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {1,3,45,67,23,67,90,4};
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		System.out.println("Sum of all the elements in array is: "+sum);
	}

}
