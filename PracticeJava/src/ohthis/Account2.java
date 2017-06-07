package ohthis;

public class Account2 {
//Trying to use this keyword to invoke constructor
	int rollno;
	String name;
	double fee;
	
	 Account2(int number, String name1,double fee1){
		rollno=number;
		this.name=name1;
		this.fee=fee1;
		
	}
	public void showdata(){
		System.out.println("Student Roll no - "+ rollno);
		System.out.println("Name of student - "+name);
		System.out.println("Student current year fee- "+fee);
	}
	public static void main(String[] args) {
		Account2 A1=new Account2(32322,"Aparna",23225.32);
		A1.showdata();
		Account2 A2=new Account2(12,"Anupama",13434.34);
		A2.showdata();
	
	}

}
