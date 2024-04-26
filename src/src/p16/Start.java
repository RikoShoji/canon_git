package p16;

public class Start {
	public static void main(String[] args) {
	Oya o1 = new Oya(); //親だけ
	Kodomo k1 = new Kodomo();
	
    Oya o2 = new Kodomo();  //k5でキャストできる
//  Kodomo k2 = new Oya();
//  Kodomo k3 = o1;
//  Kodomo k4 = (Kodomo)o1;  //error
	Kodomo k5 = (Kodomo)o2;
	
	System.out.println(o1 instanceof Oya); //true
	System.out.println(o1 instanceof Kodomo); //false o1はKodomoじゃない
	System.out.println(k1 instanceof Oya); 
	System.out.println(k1 instanceof Kodomo);
	System.out.println(o2 instanceof Oya); 
	System.out.println(o2 instanceof Kodomo);
	System.out.println(k5 instanceof Oya); 
	System.out.println(k5 instanceof Kodomo);
	
	
	
	}
}


