package Assignment_18;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {

		int binaryVal, temp, remainder, decimal = 0, n = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Please Enter Number =  ");
		binaryVal = sc.nextInt();

		temp = binaryVal;

		while (temp > 0) {
			remainder = temp % 10;
			decimal = (int) (decimal + remainder * Math.pow(2, n));
			temp = temp / 10;
			n++;
		}

		System.out.println("Binary " + binaryVal + " To Decimal Result = " + decimal);
	}

}
