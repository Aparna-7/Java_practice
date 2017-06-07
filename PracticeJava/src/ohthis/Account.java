package ohthis;

public class Account {
//Trying to use this keyword to call current class variable
	int a;
	int b;
	
	public void setdata(int c,int d){
		a=c;
		b=d;
	}
	
	public void showdata(){
		System.out.println("A is -"+a);
		System.out.println("B is -"+b);
	}
	public static void main(String[] args) {
		// create an object
		Account o1=new Account();
		o1.setdata(2,3);
		o1.showdata();
		Account o2= new Account();
		o2.setdata(12, 13);
		o2.showdata();
	}

}
