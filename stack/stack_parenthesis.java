import java.util.Scanner;

public class stack_parenthesis {
	public static void main(String[] args)
	{
		int top=-1;
		char stack[]=new char[50];
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the String containing brackets : ");
		String arr=s1.nextLine();
		for(int i=0;i<arr.length();i++)
		{
			char ch=arr.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(')
			{
				stack[++top]=ch;
			}
			else if((ch=='}' && stack[top]=='{') || (ch==']' && stack[top]=='[') ||(ch==')' && stack[top]=='('))
			{
				top--;
			}
		}
		if(top==-1)
		{
			System.out.println("String is Balanced");
		}
		else
		{
			System.out.println("String is Not Balanced");
		}
	}
}