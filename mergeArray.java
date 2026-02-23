//Merge Two Arrays.
/*a = [1, 2, 3]
b = [4, 5, 6]
o/p:
[1, 2, 3, 4, 5, 6]*/
import java.util.*;
class mergeArray
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=in.nextInt();
		}
		int c[]=merge(a,b);
		for(int i:c)
		{
			System.out.print(i+" ");
		}
	}
	static int[] merge(int a[],int b[])
	{
		int n=a.length;
		int m=b.length;
		int c[]=new int[n+m];
		for(int i=0;i<n;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<m;i++)
		{
			c[n+i]=b[i];
		}
		return c;
	}
}
