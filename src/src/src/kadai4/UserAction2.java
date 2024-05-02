package kadai4;

import java.util.Scanner;

public class UserAction2 {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("会員を登録します");
	   User user1 = new User();
       
	   System.out.println("名前:");
	   user1.name = scan.next();
	   
	   System.out.println("年齢:");
	   user1.age = scan.nextInt();
	   
	   System.out.println("--------");
	  
	   //System.out.println("名前:" + user1.name);
	   //System.out.println("年齢:" + user1.age );
	   System.out.println("会員を登録しました");
	   user1.showinfo();
	   //System.out.println("名前:" + user1.name);
	   //System.out.println("年齢:" + user1.age );
	   
	}

}
