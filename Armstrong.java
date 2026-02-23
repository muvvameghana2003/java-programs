import java.util.*;
class Armstrong
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
		if(arm(n))
		{
			System.out.print(n+" is a Armstrong number");
		}
		else
		{
			System.out.print(n+" is not a Armstrong number");
		}
	}
	static boolean arm(int n)
	{
		int t=n;
		int sum=0;
		int c=count(n);
		while(n>0)
		{
			int r=n%10;
			sum=sum+(int)Math.pow(r,c);
			n=n/10;
		}
		return sum==t;
	}
	static int count(int n)
	{
		int c=0;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		return c;
	}
	
}