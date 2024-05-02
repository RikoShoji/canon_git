package p01;

public class Sample18 {
    //static int a;//メンバ変数
	public static void main(String[] args) {
        int age =22;
        
            String result = age >= 18 ? "成人" : "未成年";
        	System.out.println( result);
        	//配列の宣言と領域の確保とデータの設定
    		String[] canon = new String[] {"田中", "遠藤", "椿"};
            String[] sony;
            
            sony = canon;
            
            sony [1] = "kudo"
    
    		System.out.println(canon[0]);
    		System.out.println(canon[1]);
    		System.out.println(canon[2]);
    		System.out.println(canon.length); //要素数
    	}

    

        }


        	
        
        
	
		
	
	

