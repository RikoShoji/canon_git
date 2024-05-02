package p01;

public class Sample17 {
    //static int a;//メンバ変数
	public static void main(String[] args) {
        int age =22;
        
            String result = age >= 18 ? "成人" : "未成年";
        	System.out.println( result);
        	//配列の宣言と領域の確保とデータの設定
    		//データ型[]配列名 = {データ1,データ2,...};
    		//データ型[]配列名 = new データ型[]{データ1,データ2,...};
    		String[] canon = new String[] {"田中", "遠藤", "椿"};

    		//領域の確保（何部屋を用意するのか）
    		//配列名=データ型[部屋の数]
    		//canon = new String[3];
    		//データ型[]配列名= new データ型[部屋の数];
    		
    		
    		//マンションの部屋に住人を住まわせる
    		//canon[0]="田中"
    		//canon[1]= "遠藤"		
    	    //canon[2]= "椿"
    	    
    		System.out.println(canon[0]);
    		System.out.println(canon[1]);
    		System.out.println(canon[2]);
    		System.out.println(canon.length); //要素数
    	}

    

        }
        
        	
        
        
	
		
	
	

