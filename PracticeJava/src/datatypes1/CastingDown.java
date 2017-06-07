package datatypes1;

	class A1{
		int x=8;
		void Me(){
			System.out.println("Me-parent");
		}
		void You(){
			System.out.println("You-parent");
		}
		//A1 a=new A1();
		//B1 b=(B1) A1();
		
	}
	
	class B1 extends A1{
		int x=88;
		void Me1(){
			
			System.out.println("Me-child");
		}
		void You1(){
			System.out.println("You-child");
		}
	}
	public class CastingDown extends B1{
		int x=32;
		//int y=787;

	public static void main(String[] args) {
	    
		//
		System.out.println("upcasting");
		CastingDown cast= new CastingDown();

       System.out.println("downcasting from castingdown to B1");
       B1 b2=new B1();
       B1 c= b2;
       System.out.println(c.x);
       //System.out.println(c.y);
       
       System.out.println("casting from B1 to A1");
       
       A1 a5=new A1();
       B1 b1=(B1)a5;
       
       b1.Me1();
       b1.You1();
       System.out.println(b1.x);
	}


	}
