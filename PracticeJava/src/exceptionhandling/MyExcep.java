package exceptionhandling;

public class MyExcep {

	public static void main(String[] args) {
		//trying exception handling  by try-catch methods
		try{
		int i=50/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Remaining code");

	}

}
