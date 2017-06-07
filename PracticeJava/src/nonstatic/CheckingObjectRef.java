package nonstatic;

public class CheckingObjectRef {
//dummy code to check obj ref=null
	
	/*int id=345445;
	String name="Aparna";
	String Company="Google";
	
	public static void main(String[] args){
		
		CheckingObjectRef O1=new CheckingObjectRef();
		O1.id=345445;
		O1.Company="Google";
		O1.name="Aparna";
		
		
		System.out.print(O1);
		
	}*/
	
	static int a=10;
	static int b=56;
	
	int x=9;
	int y=23;
	
 static	void m1(){
		int x=78;
		final int c=33;
		System.out.println("m1-"+x +"c="  +c);
	}

	public static void main(String[] args){
		
		int e=9;
		
		//create object
		CheckingObjectRef ex=new CheckingObjectRef();
		System.out.println(CheckingObjectRef.a);
		System.out.println(CheckingObjectRef.b);
		System.out.println(ex.x);
		System.out.println(ex.y);
		System.out.println(ex.a);
		CheckingObjectRef.m1();
		System.out.println(e);	
		
	}

}

