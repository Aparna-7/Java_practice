package datatypes1;

public class Basics1 {

	//primitive data types
	 byte b=12;
	int i='e';
	String s="Happy";
	char c='A';
	double d=1.2;
	float f=5.7f;
	boolean j=true;
	short e=3276;
	char r=66;
	
	  
	//reference type variable
	

	public static void main(String[] args) {
		                                              
                          
		int a[]={1,2,3,4,5};
		for(int i=0;i<a.length;i++){                       /*i=0,i<=4,a[i]=4,i=1,i<=4,a[i]=1,i=2,a<=4,a[i]=2,i=3,i<=4,a[i]=3,i=4,a=4,a[i]=4,i=5,a>4
		
		                                                      */
			System.out.println(a[i]);
		}
		
	      Basics1 b1=new Basics1();
	       Basics1 e1=new Basics1();
	       Basics1 i1=new Basics1();
	       Basics1 s1=new Basics1();
	       Basics1 f1=new Basics1();
	       Basics1 j1=new Basics1();
	       Basics1 r1=new Basics1();
	       Basics1 d1=new Basics1();
	     //  Basics1 a=new Basics1();
	      //System.out.println(b1);
	       
		System.out.println("byte -"+b1.b);
		System.out.println("short -"+e1.e);
		System.out.println("int -"+i1.i);
		System.out.println("String  -"+s1.s);
		System.out.println("float -"+f1.f);
		System.out.println("boolean -"+j1.j);
		System.out.println("char -"+r1.r);
		System.out.println("double -"+d1.d);
		System.out.println("array -");
	
	}
	

}
