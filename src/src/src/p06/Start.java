package p06;

public class Start {

	public static void main(String[] args) {
		
		Human h1 = new Human("Haerin",17);
		h1.introduce();
		
		Human h2 = new Human("Haerin",17);
		
		h2.name = "Haerin";
		h2.age = 17;
		
		h2.introduce();
		
	}

}
