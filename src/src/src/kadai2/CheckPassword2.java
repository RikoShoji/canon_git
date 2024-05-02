package kadai2;

import java.util.Scanner;

public class CheckPassword2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean judge = false;
        String pw;
        
        
        System.out.println("パスワードを入力してください");
        pw = scan.next();
        
	    
	    while (!pw.equals("himitu")) {
	    	System.out.println("再入力してください");
	    	pw = scan.next();
	    }
	
	    if(pw.equals("himitu")) {
	    	System.out.println("ログインできました");
	    	}
	    }
        

        }
