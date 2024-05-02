package p13;//継承とカプセル化 p.189 p.172

	public class Phone extends Camera{
		//フィールド
		private String phonenumber; //電話番号
	
	    //コンストラクタ
	  public Phone(){//デフォルト・コンストラクタ（引数なし）
	
	}
	  public Phone(String phonenumber,String manuf){
			this.phonenumber= phonenumber;  //p.172～173
			super.manuf = manuf;
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


