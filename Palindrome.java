import java.util.*;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n<0)
		{
			System.out.print("Enter a valid number");
			return;
		}
		if(pali(n))
		{
			System.out.print(n+" is a palindrome number");
		}
		else
		{
			System.out.print(n+" is not a palindrome number");
		}
		in.close();
	}
	static boolean pali(int n)
	{
		int k=reverse(n);
		return k==n;	
	}
	static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
}