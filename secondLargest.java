//Find second largest element in array.
import java.util.*;
class secondLargest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		if(n<2)
		{
			System.out.print("to compare there is no elements");
			return;
		}
		int result = second(a);

		if(result == Integer.MIN_VALUE)
    			System.out.println("Second largest does not exist");
		else
    			System.out.println(result);
	}
	static int second(int a[])
	{
		int h1=Integer.MIN_VALUE;
		int h2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>h1)
			{
				h2=h1;
				h1=a[i];
			}
			else if(a[i]>h2 && a[i]<h1)
			{
				h2=a[i];
			}
		}
		return h2;
	}
}