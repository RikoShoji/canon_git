package kadai2add;

import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("文字列の個数を入力してください");
		int count = scan.nextInt();
		
		String [] list = new String [count];
		String str = "";
		
	
		
		for (int i = 0; i < list.length;i++) {
			System.out.println((i + 1) + "つ目の文字列を入力してください");
			list[i]= scan.next();
		}
		for(String s : list) {
			if(str.length()<s.length()) {
				str = s;
			}
			
		System.out.println("最も多い文字列は「\" + str + \"」です");
			}
		}
	}
	


