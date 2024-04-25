package p10;

public class Start {

	public static void main(String[] args) {
	    Human[] canon = {
	    		new Human("斎藤",23);
	    		new Human("深沢",24);
	    		new Human("本間",25);
	    }
	    
	    canonn[0]=new Human ("斎藤",23);
	    canonn[1]=new Human ("深沢",24);
	    canonn[2]=new Human ("本間",25);
	    
		int[]list = {10,20,30};
		
		for(String data: list) {
			System.out.println(data);
		}
		
		String = new String[3];
		
		list[0]="AAA";
		list[1]= "BBB";
		list[2]= "CCC";
			
		for(int data: list) {
			System.out.println(data);
		}
	
		Human h1 = new Human("Haerin",17);
		h1.introduce();
		
		Human h2 = new Human();
		
		h2.name = "Haerin";
		h2.age = 17;
		
		h2.introduce();
		
	}

}
