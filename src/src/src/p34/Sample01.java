package p34; //enum 列挙型
public class Sample01 {

	public static void main(String[] args) {
		//Canon c = Canon.OKU;
		
		//System.out.println(c);
		//拡張for文
	    for (Canon c : Canon.values()) { 
	    	System.out.println(c.getId() + "" + c.getName());
	    	
	    }
	   }           
	}
	 
	   