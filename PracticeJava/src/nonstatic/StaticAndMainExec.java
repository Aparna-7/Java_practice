package nonstatic;

public class StaticAndMainExec {
	
	static int a=m1();
	
	static int m1(){
		
		System.out.println("m1(0)");
		
		return 100;
	}
	//static int b=m2();
	
	static int m2(){
		System.out.println("m2(0)");
		return 300;
	}
	
	

	public static void main(String[] args) {
		
		int x=1;
		System.out.println("local variable is--"+x);
		System.out.println("a-"+a);
		System.out.println("b-"+b);
		StaticAndMainExec.m3();
		StaticAndMainExec.m1();
		m2();
	}
 
	   static int b=m2();
	   
	   static void m3(){
		   System.out.println("m3 -"+a);
	   }
}
