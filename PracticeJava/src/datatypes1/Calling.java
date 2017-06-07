package datatypes1;

public class Calling {
	
	//static
	static int i=9;
	static int r=44;
	
	//non static
	int x=33;
	int y=22;
	
	public static void main(String[] args) {
	   //local variables
		int x=55;
		int e=773;
		
		//object
		Calling o1=new Calling();
		Calling o2=new Calling();
		
		
		System.out.println(+x);
		System.out.println(+e);
		System.out.println(+i);
		System.out.println(+r);
		System.out.println(o1.x);
		System.out.println(o2.y);
		
		
		
	}
	
	
 }

