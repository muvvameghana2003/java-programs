//Array duplicates.
/*Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.*/

import java.util.*;
class duplicateElement
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
		System.out.print(duplicate(a));
	}
	static ArrayList<Integer> duplicate(int a[])
	{
		HashSet<Integer> obj=new HashSet<>();
		ArrayList<Integer> obj1=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(!(obj.add(a[i])))
			{
				obj1.add(a[i]);
			}
		}
		return obj1;
	}
}