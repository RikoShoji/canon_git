package kadai1;

import java.util.Scanner;

public class CheckInteger1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください：");
		int data = scan.nextInt();

		if (data == 7) {
			System.out.println("大当たり!");
		} else {
			System.out.println("ハズレ");
		}

	}
}
//電話番号:090-1234-5678
//話し中です！
//メーカー:キヤノン
//写真を撮る
