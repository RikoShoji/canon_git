package p29;  //Wrapper class

public class Sample05 {

	public static void main(String[] args) {
		int a = 10;
		//Integer x = new Integer(a);
		
		Integer x = 100; //Auto-Boxing
	    //int b = x.intValue();
	    int b = x; //Auto-Unboxing
	    
		System.out.println(x); 
		System.out.println(b);
		System.out.println(Integer.toBinaryString(10));
		
		
		
		
		
	   }           
	
	}
	 
	   