package amsuper;
//commited to github
//super is used to refer immediate parent class instance variable.
   class Super2{
	  String name="I am SUPER";
	
	// super can be used to invoke parent class method
	  void You(){
		System.out.println("You are from super class Super2");
	}
	
  }
   //super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.
    class Superyou extends Super2 {
    	
    	String name="We all are Super";
     void get(){
    	
    	System.out.println("second class-method-");
    	System.out.println(super.name);
    }
    void Me(){
    	System.out.println("ME");
    }
    void You(){
    	System.out.println("You from class Superyou");
    }
    void we(){
    	System.out.println("We from class superyou");
    	super.You();
    	get();
    }
}
	
	public class SuperMe{
		
	      public static void main(String[] args) {
	
	    	  Superyou s=new Superyou();
	    	  s.get();
	}

}
