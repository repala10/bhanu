9) String reverse
	package javaprogrames;

public class Stringreverse {

	public static void main(String[] args) 
	{
	String name ="akhil";
	char a[]=name.toCharArray();
	for(int i=a.length-1; i>=0; i--)
	{
	System.out.println(a[i]);	
	}
	}