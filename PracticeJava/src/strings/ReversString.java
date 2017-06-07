package strings;

public class ReversString {

	public static void main(String[] args) {
	//code to reverse a string using stringuffer 
	String name="Hi How are you doing?";
	String reverse=new StringBuffer(name).reverse().toString();
	System.out.println("original name is  " +name);
    System.out.println("reversed String is "  +reverse);
	
    //code to reverse a string without stringbuffer method
	String input="JAVA";
    char[] s=input.toCharArray();
	for(int i=s.length-1;i>=0;i--)
	System.out.print(s[i]);		
	
	//code to convert string to lower case
	String lower=input.toLowerCase();
	System.out.println("lower case of JAVA is -"+lower);
	
	//code to convert lower string to upper case
	String d="java";
	String upper=d.toUpperCase();
	System.out.println("Upper case of java is -"+upper);
	//code to display string from character array
	char[] h={'A','P','A','R','N','A'};
	String a=new String(h);
	System.out.println(a);
	
	//code to compare strings
	String s1="Sachin";  
	   String s2="Sachin";  
	   String s3="Ratanaaa";//Aparna  
	   System.out.println(s1.compareTo(s2));//0  
	   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
	   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  

}
}