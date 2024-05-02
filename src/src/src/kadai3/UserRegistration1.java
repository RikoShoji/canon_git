package kadai3;

import java.util.Scanner;

public class UserRegistration1 {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	  
	    System.out.print("名前を入力してください：");
		String name = scan.next();
	
		if(name.length() > 20){
			System.out.println("名前は20文字以内で入力してください");
			return;
		}
			
		if(name.equals("admin")) {
			System.out.println("利用できない名前です");
			return;
		}	
		if(name.contains("㌔")) {
			System.out.println("名前に禁止文字が含まれています");
			return;	
		}
				
	System.out.print("年齢を入力してください：");
	int age = scan.nextInt();if (!(0 <= age && age <= 130)) { // if (age < 0 || 130 < age) {　でもOK
		System.out.println("年齢は0以上130以下で入力してください");
		return;
	}

	System.out.println("名前："+ name +"年齢："+ age + "で登録しました。");
		
		}
	}
	
