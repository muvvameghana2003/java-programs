import java.util.*;
class prime
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n<=0)
		{
			System.out.print("give a valid number");
			return;
		}
		boolean b=prime(n);
		if(b==true)
		{
			System.out.print(n+" is a Prime number");
		}
		else
		{
			System.out.print(n+" is not a Prime number");
		}
	}
	static boolean prime(int n)
	{
		
		if(n==1 || (n%2==0 && n!=2))
		{
			return false;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}