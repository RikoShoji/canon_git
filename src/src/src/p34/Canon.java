package p34; //enum 列挙型

public enum Canon {
   OKU(1,"奥"), 
   KUDO(2,"工藤"),
   ENDO(3,"遠藤");
	
	private int id;
	private String name;
	
	//定数とコンストラクタを紐づけている　Canonクラスに列挙型の中に別のクラスがある
	Canon(int id, String name){  
		this.id = id;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
