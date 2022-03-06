package assignment_15;

import java.util.Scanner;

public class Calculator {

	public static void addition(int a, int b) {
		System.out.println(a + b);
	}

	public static void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void division(int a, int b) {
		System.out.println(a / b);
	}

	public static void average(int a, int b) {
		System.out.println((a / b) / 2);
	}

	public static void modulo(int a, int b) {
		System.out.println(a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter your choice:\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Average \n 6.Modulo");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			addition(a,b);
			break;
		case 2:
			subtraction(a,b);
			break;
		case 3:
			multiplication(a,b);
			break;
		case 4:
			division(a,b);
			break;
		default:
			System.out.println("Enter correct choice number ");
		}
		
	
	
		
	}
}
