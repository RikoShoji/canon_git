package p13;

public class Phone {

	public class Phone extends Camera{
		//フィールド
		private String phonenumber; //電話番号
	}   
	    //コンストラクタ
	  public Phone(){
	
	}
	  
	  public Phone(String phonenumber,String manuf){
			this.Phonenumber= phonenumber
					super manuf = manuf
		}
		//アクサスメソッド
	  public String getPhonenumber(String phonenumber,String manuf) {
	       return phonenumber;
	   }
	    
	    public String setPhonenumber(String phonenumber) {
	       this.phonenumber = phonenumber;
	    }
	  
	  
	  
	  
		void talk() {
			System.out.println("電話番号:"+ phonenumber);
			System.out.println("話し中です！");
		}
		
		
	
		
	}


