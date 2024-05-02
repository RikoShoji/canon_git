package p14;

	public class Phone extends Camera{
//フィールド
		private String phonenumber; //電話番号
	
//コンストラクタ
	  public Phone(){
	}
	  public Phone(String phonenumber,String manuf){
		    super(manuf);
			this.phonenumber= phonenumber;
			//setManuf(manuf); 
		}
//アクサスメソッド
	  public String getPhonenumber(String phonenumber,String manuf) {
	       return phonenumber;
	   }
	    
	    public void setPhonenumber(String phonenumber) {
	       this.phonenumber = phonenumber;
	     
	    }
	  
		public void talk() {
			System.out.println("電話番号:"+ phonenumber);
			System.out.println("話し中です！");
		}
		
	
		
	}


