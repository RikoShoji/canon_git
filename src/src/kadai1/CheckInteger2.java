package kadai1;

import java.util.Scanner;

public class CheckInteger2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("xの値を入力してください");
		int x = scan.nextInt();

		System.out.println("yの値を入力してください");
		int y = scan.nextInt();
        //ここまでが入力の処理
		if (x > y) {
			System.out.println("xはyより大きいです");
		} else if (x < y) {
			System.out.println("xはyより小さいです");
		} else if (x==y) {
			System.out.println("xとyは等しいです");
			}
		//else {
			//System.out.println("xとyは等しいです")//;//
		}


}
