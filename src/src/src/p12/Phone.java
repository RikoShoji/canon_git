package p12;

public class Phone extends Camera {
		//フィールド
		private String phonenumber; //電話番号
	
	    //コンストラクタ
	  public Phone(){
		
		  System.out.println("Phoneコンストラクタ");
	}
	  
	  public Phone (String phonenumber, String maker) {

		}
		//アクサスメソッド
	  public String getPhonenumber(String phonenumber,String manuf) {
	       return phonenumber;
	   }
	    
	    public void setPhonenumber(String phonenumber) {
	       this.phonenumber = phonenumber;
	    }
	  
	  
	  
	  
		void talk() {
			System.out.println("電話番号:"+ phonenumber);
			System.out.println("話し中です！");
		}
		
		
	
		
	}


