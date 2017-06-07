package ohthis;

public class Acc {
//trying to invoke current class method by this
	
	 Acc(){
		  //Acc(int x);
		 // this();
		  System.out.println("B|");
		 
	  }
	void M(){
		System.out.println("Method M");
	}
	
	void N(){
		System.out.println("Method N");
		M();
	}
}
  class B{
	 
	public static void main(String[] args) {
		Acc T1=new Acc();
		T1.N();
		

	}

}
