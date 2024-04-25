package kadai4add;

import java.util.Scanner;

public class UseConvert {
	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
		System.out.print("整数を入力して下さい：");
		int input1 = scan.nextInt();
		Convert.reverse(input1);
	
		System.out.print("浮動小数点数を入力して下さい：");
		double input2 = scan.nextDouble();
		Convert.reverse(input2);
		
		System.out.print("文字列を入力して下さい：");
		String input3 = scan.next();
		Convert.reverse(input3);
		
		}

}


