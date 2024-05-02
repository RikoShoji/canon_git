package p23;

public class Start {

	public static void main(String[] args) {
		//Canon can = new Canon();
		Canon[] list = new Canon[2]; //配列とfor文 p.106
		list[0] = new Oku();
		list[1] = new Kudo();
		
		for (Canon c : list) {
			c.work();
			c.salary();  // ポリモーフィズムp.207
		}
	    
	    
	    
	 
	   }
	}
	   
	   