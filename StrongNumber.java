/*Simple Example

Let’s take 145

Digits: 1, 4, 5

Now calculate factorial of each digit:

1! = 1

4! = 4 × 3 × 2 × 1 = 24

5! = 5 × 4 × 3 × 2 × 1 = 120

Now sum them:

👉 1 + 24 + 120 = 145

✅ So, 145 is a Strong Number*/
import java.util.*;
class StrongNumber
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
		if(strong(n))
		{
			System.out.print(n+" is a strong number");
		}
		else
		{
			System.out.print(n+" is not a strong number");
		}
	}
	static boolean strong(int n)
	{
		int t=n;
		
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int p=1;
			for(int i=1;i<=r;i++)
			{
				p=p*i;
			}
			sum=sum+p;
			n=n/10;
		}
		return t==sum;
	} 
}