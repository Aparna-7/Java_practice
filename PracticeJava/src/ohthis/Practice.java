package ohthis;

public class Practice {
	/*//The this() constructor call can be used to invoke the current class constructor. 
	It is used to reuse the constructor. In other words, it is used for constructor chaining.*/
	Practice(){
		this(23);//Calling parameterized constructor from default constructor:
		System.out.println("hello a");
		}  
	Practice(int x){  
	//this();  //Calling default constructor from parameterized constructor:
	System.out.println(x);  
	}  
}  

	class This5{  
	public static void main(String args[]){  
	Practice a=new Practice();  
	
	}

}
