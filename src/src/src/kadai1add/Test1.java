package kadai1add;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("国語の点数を入力してください:");
	  int japanese = scan.nextInt();
	  System.out.println("数学の点数を入力してください:");
	  int math = scan.nextInt();
	  System.out.println("英語の点数を入力してください:");
	  int english = scan.nextInt();
	  
	  double average = (japanese + math + english)/3.0;
			  
	  System.out.println("平均は"+ average+"点です");
	}
}
//国語の点数を入力してください:
//70
//数学の点数を入力してください:
//80
//英語の点数を入力してください:
//95
//平均は81.66666666666667点です

