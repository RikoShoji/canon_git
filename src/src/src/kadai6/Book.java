package kadai6;

public class Book extends Item {
		//フィールド
        private String author;
        //コンストラクタ
        public Book() { //デフォルト・コンストラクタ
        	
        }
        
        public Book(String name, int price, String author) {  //authorしかていぎしていないから
        	super(name,price);  //superでnameとpriceを設定する
        	
        	this.author = author; //
        }
        //著者に対するセッタ&ゲッタ
        public String getAuthor() {
        	return author;     
        }
        
        public void setAuthor(String author) {
        	this.author = author;
        }
        //showInfoメソッド
        public void showInfo(){
        super.showInfo();                   //override(再定義)
        System.out.println("著者:"+ author);
        
        
        }
	}


