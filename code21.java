//21. Reverse a string
import java.util.Scanner;
public class code21 {
	public static void main(String[ ] arg)
	{
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	str=sc.nextLine();	
	char[] ch=str.toCharArray(); 
	System.out.println("Reverse of a String is :"); 
	int j=ch.length;
	for(int i=j;i>0;i--)
	{
	System.out.print(ch[i-1]); 
	}
    sc.close();
	}
}

