package datatypes1;

	class A{
		int x=8;
		void Me(){
			System.out.println("Me-parent");
		}
		void You(){
			System.out.println("You-parent");
		}
	}
	
	class B extends A{
		int x=88;
		void Me(){
			
			System.out.println("Me-child");
		}
		void You1(){
			System.out.println("You-child");
		}
	}
	public class CastingUp {
	public static void main(String[] args) {
		
		A a1=new B();
		a1.Me();
		a1.You();
		System.out.println(a1.x);
	}

	
}
