package kadai2add;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1つ目の文字列を入力してください");
		String s1 = scan.next();
		
		System.out.print("2つ目の文字列を入力してください");
        String s2 = scan.next();
        
        String judge = s1.equals(s2)  ? "同じです":"異なります";
                      //s1==s2  //judge
        System.out.println("2つの文字列は"+ judge);
    
	}

}
