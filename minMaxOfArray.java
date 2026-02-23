//Find largest and smallest element in array.
import java.util.*;
class minMaxOfArray
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n==0)
		{
			System.out.print("The Array is Empty");
			return;
		}
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		minmax(a);
		in.close();
	}
	static void minmax(int a[])
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print(max+" "+min);
	}
}