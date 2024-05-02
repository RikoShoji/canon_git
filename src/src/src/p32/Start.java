package p32; //List インターフェイス

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		//Controller c = new Controller();
		//Controller[] list = new Controller[2];
	    List<Controller> list = new ArrayList<>();
	    
	    list.add(new Baseball());
	    list.add(new Mario());
	    //list[0]=new Baseball();
	    //list[1]=new Mario();
	    
	    for (Controller con:list) {
	    	con.pushA();
	    	con.pushB();
	    System.out.println("---------");
	    }
	 
	   }
	}
	   
	   