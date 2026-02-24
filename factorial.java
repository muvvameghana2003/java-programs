//Factorial (without recursion).
import java.util.*;
class factorial
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n<0)
		{
			System.out.print("Enter a positive number");
			return;
		}
		System.out.print(fact(n));
	}
	static int fact(int n)
	{
		int p=1;
		for(int i=1;i<=n;i++)
		{
			p=p*i;
		}
		return p;
	}
}